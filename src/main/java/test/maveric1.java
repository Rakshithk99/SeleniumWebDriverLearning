package test;

public class maveric1 {
public static void main(String[] args) {
	String s="Coronao";
	String sn="";
	String star="";
	int count=1;
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)=='o') {
			star = "";
			for(int j=1; j<=count; j++) {
				star = star+"*";
				
			}
			count = count+1;
			sn = sn+star;
		} else {
			sn = sn + s.charAt(i);
		}
		System.out.println(sn);
	}
}
}
