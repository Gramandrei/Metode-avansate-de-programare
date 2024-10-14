public class Aufgabe4 {
    public static void main(String[] args) {
        int[] keyboards = {10, 15, 20, 30, 50, 65, 40};
        int[] drives = {30, 55, 65, 70, 20, 15, 60};
        int budget = 40;
        //unterpunkt 1
        System.out.println("Most cheap keyboard is: " + cheapestKeyboard(keyboards));
        //Unterpunkt 2
        System.out.println("Most expensive thing is: " + mostExpensiveThing(keyboards, drives));
        //Unterpunkt 3
        System.out.println("Most expensive drive you can afford: " + driveAccessibleByBudget(budget, drives));
        //Unterpunkt 4
        System.out.println("Most expensive combination you can afford: " + mostExpensiveAffordableCombination(keyboards, drives, budget));

    }

    public static int cheapestKeyboard(int[] keyboards) {
        int minPrice = Integer.MAX_VALUE;
        for (int keyboard : keyboards) {
            if (keyboard < minPrice) {
                minPrice = keyboard;
            }
        }
        return minPrice;
    }

    public static int mostExpensiveThing(int[] keyboards, int[] drives) {
        int maxPrice = Integer.MIN_VALUE;
        for (int keyboard : keyboards) {
            if (keyboard > maxPrice) {
                maxPrice = keyboard;
            }
        }
        for (int drive : drives) {
            if (drive > maxPrice) {
                maxPrice = drive;
            }
        }
        return maxPrice;
    }

    public static int driveAccessibleByBudget(int budget, int[] drives) {
        int maxPrice = Integer.MIN_VALUE;
        for (int drive : drives) {
            if (drive > maxPrice && drive < budget) {
                maxPrice = drive;
            }
        }
        return maxPrice;
    }

    public static int mostExpensiveAffordableCombination(int[] keyboards, int[] drives, int budget) {
        int maxPrice = Integer.MIN_VALUE;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int total = keyboard + drive;

                if (total <= budget && total > maxPrice) {
                    maxPrice = total;
                }
            }
        }
        return maxPrice;
    }

}
