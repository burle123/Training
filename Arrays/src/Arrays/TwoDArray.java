package Arrays;

public class TwoDArray {

    public static void main(String[] args) {
        // 2 students, 3 subjects
        int[][] marks = {
            {85, 90, 88},  // Marks for Student 1
            {78, 82, 80}   // Marks for Student 2
        };

        // Display the marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
