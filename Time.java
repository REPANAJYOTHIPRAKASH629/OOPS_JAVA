import java.io.*;
import java.util.*;
import java.text.*;
public class Time
{
	public static void main(String ar[])
	{
		int HOUR,SECOND,MINUTE;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter seconds  :   ");
		int a=s.nextInt();
		System.out.println("Enter Minutes :    ");
		int b=s.nextInt();
		System.out.println("Enter Hours      :    ");
		int c=s.nextInt();
		GregorianCalendar date=new GregorianCalendar();
		int second=date.get(Calendar.SECOND);
		int minute=date.get(Calendar.MINUTE);
		int hour=date.get(Calendar.HOUR);
		if(second >a)
			SECOND=second-a;
		else
			SECOND=a-second;
		if(minute >b)
			MINUTE=minute-b;
		else
			MINUTE=b-minute;
		if(hour>c)
			HOUR=hour-c;
		else
			HOUR=c-hour;
		System.out.println("Difference between two times is "+HOUR+":"+MINUTE+":"+SECOND);

	}     }
