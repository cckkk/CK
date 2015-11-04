package hello;

import java.text.DateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello Git");
		System.out.println("Current Time is : " + getTime());
	}

	private static String getTime() {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		// TODO Auto-generated method stub
		return formattedDate;
	}

}
