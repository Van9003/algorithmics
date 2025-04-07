
public class NullPathTimes {
	
	
	public static void main(String[] arg) {
		for(int n = 45; n < 1000; n+=5) {
			long t1=0,t2 =0;
			for(int i = 0; i <100; i++) {
				t1 += System.currentTimeMillis();
				NullPath.calculate(n);
				t2 += System.currentTimeMillis();
			}
			System.out.println("\nn = "+n+" ** "+"TIME = "+(t2-t1)/100);
		}
	}
}
