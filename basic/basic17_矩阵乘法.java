import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/12 17:27
 * @File: basic17_矩阵乘法.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T58

public class basic17_矩阵乘法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matrix = new int[N][N];
        int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = result[i][j] = sc.nextInt();
            }
        }

        if (M == 0) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
            return;
        } else if (M == 1) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
            return;
        } else {
            for (int m = 1; m < M; m++) {
                int[][] temp = new int[N][N];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        int sum = 0;
                        for (int k = 0; k < N; k++) {
                            sum += matrix[i][k] * result[k][j];
                        }
                        temp[i][j] = sum;
                    }
                }
                result = temp;
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
