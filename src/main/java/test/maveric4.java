package test;

public class maveric4 {
public static void main(String[] args) {
	String str = "Ab,c,de!$";
    char[] charArray = str.toCharArray();
    
    int i=0; 
    int j= charArray.length-1;
    while(i<j) {
    	if(!Character.isAlphabetic(charArray[i])) {
    		++i;
    	}
    	if(!Character.isAlphabetic(charArray[j])) {
    		--j;
    	}
    	
    	char temp = charArray[i];
    	charArray[i] = charArray[j];
    	charArray[j] = temp;
    	++i;
    	--j;
    	
    	String reversed = String.valueOf(charArray);
    	System.out.println(reversed);
    }
    
}
}
