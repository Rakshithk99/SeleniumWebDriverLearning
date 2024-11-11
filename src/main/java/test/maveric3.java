package test;

public class maveric3 {
public static void main(String[] args) {
	int i=3456;
	int sum=0;
	while (i!=0) {
		int rem = i%10;
		sum = sum+rem;
		i = i/10;
	}
	System.out.println(sum);
}
}
