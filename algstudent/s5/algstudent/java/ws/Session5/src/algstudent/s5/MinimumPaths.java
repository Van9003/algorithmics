package algstudent.s5;

import java.util.Random;

public class MinimumPaths {
	private static double p1 = 0.5;
	private static int minWeigth = 10;
	private static int maxWeigth = 99;
	static String[] v; //node vector
	static int[][] weights; //weight matrix
	static int[][] costs; //Floyd's paths cost matrix
	static int[][] p;
	
	public static void calculatePath(int n) {
		weights = new int[n][n];
		costs = new int[n][n];
		p = new int[n][n];
		initFloyd(weights);
		
		floyd(weights,costs,p);
		
		for (int source = 0; source <= n-1; source++)
			for (int target = 0; target <= n-1; target++)
				if (source != target) {
					//System.out.print("FROM " + v[source] + " TO " + v[target] + " = ");
					minimumPath(v, weights, costs, p, source, target);
					//if (costs[source][target] < 10000000);
					//	System.out.println("MINIMUM COST=" + costs[source][target]);
					//System.out.println("**************");
				}
	}
	static void floyd(int[][] weights, int[][] costs, int[][] p) {
		int n = weights.length;
		
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n ; i++) {
				for(int j = 0; j < n; j++) {
					int newcost = costs[i][k] + costs[k][j];
					if(newcost < costs[i][j]) {
						costs[i][j] = newcost;
						p[i][j] = k;
					}
				}
			}
		}
	}
	
	static void minimumPath(String[] v, int[][] weights, int[][] costs, int[][] steps, int source, int target) {
		if(costs[source][target]>-1) {
			//System.out.print(v[source]+"-->");
			path(v,steps,source,steps[source][target]);
			//System.out.println(v[target]);
		}else {
			//System.out.println("THERE IS NO PATH");
		}
	}

	/* IT IS RECURSIVE and WORST CASE is O(n), IT IS O(n) if you write all nodes */
	static void path(String[] v, int[][] steps, int i, int j) {
		if(j!=-1) {
			int pivot = steps[i][j];
			if(pivot!=-1) {
				path(v,steps,i,pivot);
			}
			//System.out.print(v[j]+"-->");
		}
	}
	
	//Fill the weight matrix
	static void initFloyd(int[][] w) {
		for (int i = 0; i < w.length; i++)
			for (int j = 0; j < w.length; j++) {
				if(Math.random()<=p1) {
					w[i][j] = new Random().nextInt(minWeigth, maxWeigth+1);
				}else {
					w[i][j] = -1;
				}
				costs[i][j] = weights[i][j];
				p[i][j] =-1;
			}
	}
}
