package test;

import java.util.Arrays;

public class sapient2 {
public static void main(String[] args) {
	char[] arr = {'7','6','3','#','1','4','#'};
	char[] arr1 = new char[arr.length];
	int start = 0;
	int end = arr.length-1;
	for(char a: arr) {
		if(a=='#') {
			arr1[start]='#';
			start += 1;
		}
		
	}
	for(char b:arr) {
		if(b!='#') {
			arr1[start] = b;
			if(start != end) {
				start += 1;
			}
		}
	
	
}
	System.out.println(Arrays.toString(arr1));
}
}
