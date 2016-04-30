package Chapter_08;

/**
 * (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
 students in increasing order of the number of correct answers.
 */
public class Exercise_03 {
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char [] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] correctCounts = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCounts[i][0] = i;
                    correctCounts[i][1]++;
                }
            }

        }
        sort(correctCounts);
        for (int row = 0; row < correctCounts.length; row++) {
            System.out.println("Student " + correctCounts[row][0] +
                    "'s correct count is " + correctCounts[row][1]);
        }
    }
    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int minCol1 = m[i][1];
            int minCol0 = m[i][0];
            int minIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (minCol1 > m[j][1]) {
                    minCol1 = m[j][1];
                    minCol0 = m[j][0];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                m[minIndex][1] = m[i][1];
                m[minIndex][0] = m[i][0];
                m[i][1] = minCol1;
                m[i][0] = minCol0;
            }
        }
    }
}
