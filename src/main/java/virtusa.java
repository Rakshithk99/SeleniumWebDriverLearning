import java.text.DecimalFormat;
import java.time.LocalDate;

public class virtusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i = 23.678976f;
		double d = 43.345434;
		
		DecimalFormat df = new DecimalFormat("######.####");
		String formatted = df.format(d);
		System.out.println(formatted);
		System.out.println(Double.parseDouble(formatted));
		
		
		LocalDate date = LocalDate.of(2024,8,21);
		;
		System.out.println(date.getMonth());
	}

}
