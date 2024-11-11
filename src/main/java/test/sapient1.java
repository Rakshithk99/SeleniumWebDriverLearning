package test;

import java.util.Arrays;
import java.util.HashMap;

import org.apache.commons.collections4.map.HashedMap;
import org.checkerframework.checker.units.qual.K;

public class sapient1 {
public static void main(String[] args) {
	//10, "Rakshith","Maths","50"
	HashMap<Integer,String[]> map = new HashMap<>();
	String[] arr = {"Rakshith","Maths","50"};
	map.put(10, arr);
	
	for(int a: map.keySet()) {
		System.out.println(a);
		System.out.println(Arrays.toString(map.get(a)));
		
	}
}
}
