package test;

import java.util.Arrays;
import java.util.HashSet;

public class maveric2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1={23,23,45,45,55,66,77,88,66};
int[] arr2= {24,33,46,45,59,66,78,88,66};

HashSet<Integer> set = new HashSet<>();
for(int s: arr1){
    set.add(s);
}
for(int s2: arr2){
    set.add(s2);
}
int setSize=set.size();
int[] finArr = new int[setSize];
int i=0;
for(int a: set) {
	finArr[i++]=a;
}
System.out.println(Arrays.toString(finArr));
String aa=Arrays.toString(finArr);


	}

}
