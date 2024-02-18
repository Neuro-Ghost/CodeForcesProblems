import java.util.Scanner;

public class C1931B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int totalWater = 0;
            int numberOfContainers = scanner.nextInt();
            int[] waterAmounts = new int[numberOfContainers];

            for (int j = 0; j < numberOfContainers; j++) {
                int waterAmount = scanner.nextInt();
                waterAmounts[j] = waterAmount;
                totalWater += waterAmount;
            }

            int avg = totalWater / numberOfContainers;
            int carry = 0;
            int flag = 0;

            for (int k = 0; k < waterAmounts.length; k++) {
                if (waterAmounts[k] >= avg) {
                    carry += waterAmounts[k] - avg;
                    waterAmounts[k] = avg;
                }
                if (waterAmounts[k] < avg) {
                    int need = avg - waterAmounts[k];
                    if (need > carry) {
                        flag = 1;
                    }
                    waterAmounts[k] = waterAmounts[k] + need;
                    carry = carry - need;
                }
            }
            if (flag == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
