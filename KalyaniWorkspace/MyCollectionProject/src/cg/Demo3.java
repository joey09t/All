package cg;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Double> m=new HashMap<String,Double>();
		//Map<String,Double> m=new TreeMap<String,Double>();
		//Map<String,Double> m=new TreeMap<String,Double>();
		m.put("Ram", 1000.00);
		m.put("Sham", 50000.00);
		m.put("Abdul", 4000.00);
		m.put("Ganesh", 1800.00);
		m.put(null, 1000.00);
		
		System.out.println(m);
		System.out.println(m.size());
		
		Set<String> keysSet=m.keySet();
		System.out.println(keysSet);
		
		for(String k:keysSet)
		{
			Double val=m.get(k);
			System.out.println(k+" has balance of Rs:"+val);
		}
		System.out.println("=================");
		Double bal=m.get("Sham");
		System.out.println("Before balance"+bal);
		
		bal=bal-30000; // auto unboxing
		m.put("Sham",bal); //auto boxing
		bal=m.get("Sham");
		System.out.println("After balance"+bal);
		System.out.println("=================");

		Collection<Double> vals=m.values();
		List<Double> vallist=new ArrayList<Double>(vals);
		Collections.sort(vallist);
		for(double d:vallist)
		{
			System.out.println(d);
		}
	
	}

}
