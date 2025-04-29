Some issues observed. Code-related may be fixed for the test:

* S3 should be cleaned up, too many redundant files.
* Calendar not implemented. I will not ask for it for the test but you should check the implementation, at least.
* No greedy algorithm. If you don't have it you should really should implement this one, as it is a possibility for the authory test.
* Floyd is not entirely right. For this matrix:

static void fillInWeights(int[][] w) {
		for (int i = 0; i < w.length; i++)
			for (int j = 0; j < w.length; j++)
				w[i][j] = 10000000;
		w[0][1] = 19;
		w[2][1] = 91;
		w[2][3] = 14;
		w[3][0] = 27;
		w[3][1] = 67;
		w[3][3] = 71;
	}

 It gets the right costs but not the paths:
ROM NODE2 TO NODE1 = NODE2-->NODE3-->NODE1

MINIMUM COST=60
When it should be:

FROM NODE2 TO NODE1 = NODE2-->NODE3-->NODE0-->NODE1

MINIMUM COST=60

You say that it's exponential complexity. Is it?
* Backtracking is alright but the doc is really barebones. Could use some explanation.
