/*
 * Question 3.1: Write a program that counts the number of correct answers for each student. 
 * Create a class called GradeExam and implement a method called countCorrectAnswers. 
 * You have a two-dimensional array representing responses from 4 students, each with 10 answers. 
 * Compare these responses with the correct key answers stored in the key array. 
 * Ensure your countCorrectAnswers method correctly identifies and counts the accurate answers for each student.
 */
public class GradeExam {

    public void countCorrectAnswers(char[] key, char[][] answers) {
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
            }
            System.out.println("Student " + i + " correct count is " + correctCount);
        }
    }

    public static void main(String[] args) {
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        char[][] studentAnswers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        };

        GradeExam obj = new GradeExam();
        obj.countCorrectAnswers(key, studentAnswers);
    }
}
