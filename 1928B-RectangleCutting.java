import java.util.Scanner;

public class RectangleCutting {
    static boolean canFormRectangle(int a, int b) {
        int gcd = gcd(a, b);
        return gcd > 1;
    }
/*

For example, let's say we have a rectangle with dimensions a = 12 and b = 8. The GCD of 12 and 8 is 4.
This means that we can make a cut of length 4 parallel to one of the sides of the original rectangle. 
After the cut, we'll have two smaller rectangles with dimensions (12 / 4) × 8 = 3 × 8 and (8 / 4) × 12 = 2 × 12. 
If any of these resulting rectangles has integer sides, we can form a new rectangle.

*/
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (canFormRectangle(a, b) || canFormRectangle(b, a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
