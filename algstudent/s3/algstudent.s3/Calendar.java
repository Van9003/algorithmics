package algstudent.s3;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private int numParticipants;
	private List<String> participants = new ArrayList<String>();
	private String[][] matrix;
	
	public Calendar(int n) {
		numParticipants = n;
		createRandomParticipants();
		matrix = new String[numParticipants][numParticipants-1];
	}

	private void createRandomParticipants() {
		for(int i = 0; i < numParticipants; i++) {
			participants.add(Integer.toString(i));
		}
	}
	
	public static void main(String args[]) {
		
	}
	
	public void calendarTimes() {
		calculateResult();
	}
	
	private void calculateResult() {
		for(int i = 0; i < numParticipants; i++) {
			if(i== 0)
				System.out.print("\nPLAYER/OPPONENT");
			else
				System.out.print("\t\tDAY "+i);
		}
		firstDay();
		for(int i = 0; i < numParticipants; i++) {
			System.out.print("\n\t"+participants.get(i) +"\t\t"+ matrix[i][0]);
		}
		
	}
	
	private void firstDay() {
		aux(numParticipants,0);
	}
	
	private void aux(int num,int start) {
		if(num == 2) {
			matrix[start][0] = participants.get(start+1);
			matrix[start+1][0] = participants.get(start);
		}else {
			aux(num/2,start);
			aux(num/2, start + num/2);
		}
	}
}
