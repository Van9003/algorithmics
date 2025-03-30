package algstudent.s5;

public class MinimumPathsTimes {
	
	public static void main(String arg[]) {
		long t1,t2;
		for(int n = 200; n < 1000000; n*=2) {
			t1 = System.currentTimeMillis();
			MinimumPaths.calculatePath(n);
			t2 = System.currentTimeMillis();
			System.out.println("\nn = "+n+" ** "+"TIME = "+(t2-t1));
		}
		
	}
}
