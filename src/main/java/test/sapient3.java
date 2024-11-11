package test;

import java.util.HashSet;
import java.util.Set;

public class sapient3 {
public static void main(String[] args) {
	Integer[] a1 = {1,2,3,1};
	Integer[] a2 = {1,2,3};
	Integer[] a3 = {1,2,3,4};
	
	Set<Integer> s1 = new HashSet<>();
	Set<Integer> s2 = new HashSet<>();
	Set<Integer> s3 = new HashSet<>();
	for(int a: a1) {
		s1.add(a);
	}
	for(int b: a2) {
		s2.add(b);
	}
	for(int c: a3) {
		s3.add(c);
	}
	System.out.println("S1: "+ s1);
	System.out.println("S2: "+ s2);
	System.out.println("S3: "+ s3);
	
	boolean check1 = s1.equals(s2);
	boolean check2 = s2.equals(s3);
	boolean check3 = s3.equals(s1);
	
	if(check1  && check2  && check3 ) {
		System.out.println("Pass");
	} else {
		System.out.println("Fail");
	}
}
}
