package algstudent.s3;

public class CalendarTimes {
	
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		Calendar c = new Calendar(n);
		int nTimes = Integer.parseInt(args[1]);
		long t1,t2;
		
		t1 = System.currentTimeMillis();
		
			c.calendarTimes();
		
		t2 = System.currentTimeMillis();
		System.out.println("\nn = "+n+" ** "+"TIME = "+(t2-t1)+" ** "+"nTimes = "+ nTimes);
	
	}
}
