import java.util.Arrays;

public class Aufgabe1 {
    public static void main(String[] args) {
        int[] grades = {37, 39, 89, 12, 75, 93, 7, 28, 13};
        //Unterpunkt 1
        System.out.println(Arrays.toString(failingGrades(grades)));
        //Unterpunkt2
        System.out.println(gradeAverage(grades));
        //Unterpunkt3
        System.out.println(Arrays.toString(roundGrades(grades)));
        //Unterpunkt4
        System.out.println(biggestRoundedGrade(grades));
    }

    public static int[] failingGrades(int[] grades) {
        int idx = 0;
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] < 38) {
                idx++;
            }
        }

        int[] failingGrades = new int[idx];
        int failingIdx = 0;
        for (int grade : grades) {
            if (grade < 38) {
                failingGrades[failingIdx] = grade;
                failingIdx++;
            }
        }
        return failingGrades;
    }

    public static double gradeAverage(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return Math.round(sum / grades.length * 100.0) / 100.0;
    }

    public static int[] roundGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i]%5 >= 3) {
                roundedGrades[i] = grades[i] + (5 - grades[i]%5);
            } else {
                roundedGrades[i] = grades[i];
            }
        }
        return roundedGrades;
    }

    public static int biggestRoundedGrade(int[] grades) {
        int biggestGrade = 0;
        int[] roundedGrades = roundGrades(grades);
        for (int grade : roundedGrades) {
            if (grade > biggestGrade) {
                biggestGrade = grade;
            }
        }
        return biggestGrade;
    }
}
