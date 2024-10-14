public class Aufgabe2 {
    public static void main(String[] args) {
        int[] numbers = {13, 15, 80, 36, 96, 23, 88, 7, 55, 91, 14, 67, 76, 32, 4, 51, 19, 31, 27, 41};
        int[] numbers2 = {2, 6, 17, 10, 7};
        //Unterpunkt 1
        System.out.println(maxNumber(numbers));
        //UNterpunkt 2
        System.out.println(minNumber(numbers));
        //Unterpunkt 3
        System.out.println(maxSum(numbers2));
        //UNterpunkt 4
        System.out.println(minSum(numbers2));
    }

    public static int maxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int minNumber(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int maxSum(int[] numbers) {
        int minNumber = minNumber(numbers);
        int sum = 0;
        for (int number : numbers) {
            if (minNumber != number) {
                sum += number;
            }
        }
        return sum;
    }

    public static int minSum(int[] numbers) {
        int maxNumber = maxNumber(numbers);
        int sum = 0;
        for (int number : numbers) {
            if (maxNumber != number) {
                sum += number;
            }
        }
        return sum;
    }
}
