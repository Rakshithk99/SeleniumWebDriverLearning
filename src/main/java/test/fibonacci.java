package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("qw");
		list.add("erer");
		list.add("Deded");
		list.add("cdrfcr");
		
		System.out.println(list.contains("dsdsd"));
		System.out.println(list.get(1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf("Deded"));
		System.out.println(list.lastIndexOf("dsds"));
		System.out.println(list.remove(3));
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.toArray());
		System.out.println(list.toString());
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(23);
		set.add(43);
		set.add(23);
		set.add(877);
		set.add(0);
		set.add(null);
		System.out.println(set);
		System.out.println(set.contains(44));
		System.out.println(set.remove(333));
		System.out.println(set.size());
		System.out.println(set.toArray());
		System.out.println(set.toString());
		
		
		HashMap<Integer, String[]> map = new HashMap<Integer, String[]>();
		String[] arr = {"Rak","Shw", "Tri"};
		String[] arr2 = {"sdsd","dsds"};
		map.put(10, arr);
		map.put(11, arr2);
		for(int i:map.keySet()) {
			System.out.println(i);
			System.out.println(Arrays.toString(map.get(i)));
			
			
			
		}
		System.out.println(map);
		System.out.println(map.containsKey("10"));
		System.out.println(map.containsKey(10));
		System.out.println(map.entrySet());
		System.out.println(map.get(10));
		System.out.println(map.toString());
		System.out.println(map.values());
		
		
		
		int[] ar = {1,2,4,5,2};
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));
		
	
	}

}
