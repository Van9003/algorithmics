import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NullPath {
	
	private static final int minWeigth = 10;
	private static final int maxWeigth = 99;
	private static final double p1 = 0.5;
	private static int[][] weigth;
	private static int[] nodes;
	private static List<Integer> nullPath;
	private static boolean found = false;
	private static int value;
	
	public static void calculate(int num){
		int n = num;
		nodes = new int[n];
		weigth = new int[n][n];
		createWeigthMatrix(n);
		nullPath = new ArrayList<>();
		calculateNullPath();
		//printNullPath();
	}
	
	private static void createWeigthMatrix(int n) {
		for (int i = 0; i < weigth[0].length; i++) {
			for (int j = 0; j < weigth[0].length; j++) {
				if(Math.random()<=p1) {
					weigth[i][j] = new Random().nextInt(minWeigth, maxWeigth+1);
				}else {
					weigth[i][j] = - new Random().nextInt(minWeigth, maxWeigth+1);
				}
			}
			nodes[i]=i;
		}
	}
	
	private static void calculateNullPath() {
		nullPath.add(nodes[0]);
		backtracking(nodes[0]);
	}

	private static void backtracking(int num) {
		if(nullPath.contains(nodes[nodes.length-1]) && nullPath.size()==nodes.length) {
			if(value <= 99 && value >= -99) {
				found = true;
				return;
			}
		}else {
			for(int i = 0; i < nodes.length; i++) {
				
				if(!nullPath.contains(nodes[i])) {
					value += weigth[num][i];
					nullPath.add(nodes[i]);
					backtracking(i);
					if(!found) {
						nullPath.remove((Integer)nodes[i]);
						value -= weigth[num][i];
					}
				}
					
				}
			}
	}
	
	private static void printNullPath() {
		for(Integer val : nullPath) {
			System.out.print(val+" ");
		}
		System.out.print("Value: " +value);
	}

	public static void ShowWeightMatrix() {
		System.out.println();
		for(int i = 0; i < nodes.length; i++) {
			for(int j = 0; j < nodes.length; j++) {
				System.out.print(weigth[i][j]+" ");
			}
			System.out.println();
		}
		
	}
		
}
