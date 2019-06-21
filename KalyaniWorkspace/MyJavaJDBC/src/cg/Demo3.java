package cg;
import java.sql.*;
public class Demo3 {

	public static void main(String[] args) throws SQLException {
		//Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //xe: database instance name , jdbc:java protocol, thin:network protocol, oracle:oracle protocol
		String user="hr";
		String pass="hr";
		
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connected");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); //used to pass sql queries
		ResultSet rs=st.executeQuery("select aid,mobileno,accountholder,balance from account");    // the program dosen't work here with * , hence all the column names need to be specified , * doesn't work with "update resultset"
		rs.afterLast(); //moves the cursor after the last record
		while(rs.previous())
		{
			int a_id=rs.getInt("aid"); //to retrieve data column name has been applied
			
			if(a_id==101)
			{
				rs.updateString("accountholder", "Raja Sharma");
				rs.updateDouble(4, 70000.00);
				rs.updateRow(); //ACTUALLY UPDATED IN A DATABASE
			}
			long mobile=rs.getLong("mobileno");
			String ah=rs.getString(3); // 3 is column number here
			double bal=rs.getDouble(4);
			System.out.println("Account id: "+a_id+" Mobile: "+mobile+"  Name: "+ah+" Balance: "+bal);
			System.out.println("==========================================================================");
			
			
			
		}
		
		con.close();

	}

}
