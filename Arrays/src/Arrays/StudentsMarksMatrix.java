package Arrays;

public class StudentsMarksMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] marks = {
		            {85, 90 },   // Marks for Student 1
		            {78, 82 },	// Marks for Student 2
		            {41, 82 },	// Marks for Student 3
		            {85, 52 }	// Marks for Student 4
		        };
		 	System.out.println("Student's Marks");
		 	System.out.println();
		        // Display the marks
		        for (int i = 0; i < marks.length; i++) {
		        	for(int j=0;j<marks[i].length;j++) {
		        		System.out.println(marks[i][j]+ " ");
		        	}
		        	System.out.println();
		        }
	}

}
