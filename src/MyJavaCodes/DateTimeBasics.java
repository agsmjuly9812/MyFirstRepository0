package MyJavaCodes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeBasics {
	
	//Added @SuppressWarnings("deprecation") just to ignore the warnings, suggested by Eclipse.
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		/*
		 * For printing default output of Date object
		 * err just prints result in red.
		 */
		System.out.println("Default Date object value: " + date.toString());
		
		System.out.println("-----------------------------------");
		
		// Returns the number of milliseconds since January 1, 1970
		System.out.println("Milliseconds since January 1, 1970: " + date.getTime());
		
		//For printing month: Month starts from zero, add 1 for standard month number
		System.out.print("Current Month: ");
		System.out.println(date.getMonth()+1);
		
		//For printing day of week: Monday is counted as 1. 
		System.out.print("Current Day: ");
		System.out.println(date.getDay());
		
		//Returns Normalized year value, add 1900 to get the current year
		System.out.print("Current Year: ");
		System.out.println(date.getYear()+1900);
		
		//Returns Current Hour
		System.out.println("Current Hour: " + date.getHours());
		
		//Returns Current Minute
		System.out.println("Current Hour: " + date.getMinutes());
		
		//Returns Current Second
		System.out.println("Current Second: " + date.getSeconds());
		
		/*
		 * If you want to make your own pattern, use SimpleDateFormat.
		 * For representation date and time pattern strings, few letters are interpreted. Please find  in the below link.
		 * https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy -> HH:mm:ss");
		System.out.println(sdf.format(date));
	}

}
