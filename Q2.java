import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    void printOrder(int i,int j, int[][] M, int[][] K) {
        if (i == j) { // base case
            System.out.print("M"+(i+1));
        }
        else {
            System.out.print("(");
            printOrder(i, K[i][j], M, K);
            System.out.print("*");
            printOrder(K[i][j]+1, j, M, K);
            System.out.print(")");
        }
    }

    // to run main class of Q2
    // Takes an input from user for number of matrices and then dimensions of each matrix from 0 to n
    // creates two Matrices K and M to calculate order
    // iterates over Mij to calculate max of value and sets M value and K value
    // uses utility class printOrder to print order recursively

    public static void main (String[] args) {
        Q2 o = new Q2();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of matrices n: ");
        n = sc.nextInt();
        int[] r = new int[n+1];
        for (int i = 0; i <= n;i++) {
            System.out.println("Enter dimensions r for "+i+"th: ");
            r[i] = sc.nextInt();
        }
        int[][] K = new int[n][n]; // adding an n*n matrix K to get value of k to be used later
        int[][] M = new int[n][n]; // java will initialize empty arrays to zero's itself
        int j;
        int temp;
        // to calculate new values of M and K using minimum value in M[i][k] + M[k+1][j] + r[i] * r[k+1] + r[j+1];
        for (int a = 1; a < n; a++) {
            for (int i = 0; i < n - a; i++) {
                j = i+a;
                int min = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    temp = M[i][k] + M[k+1][j] + (r[i] * r[k+1] * r[j+1]);
                    if (temp < min) {
                        min = temp;
                        M[i][j] = temp;
                        K[i][j] = k;
                    }
                }
            }
        }
        System.out.println("Order: ");
        o.printOrder(0, n-1, M, K);
    }
}
