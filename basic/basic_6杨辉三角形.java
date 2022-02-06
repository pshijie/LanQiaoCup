import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/3 18:57
 * @File: basic_6杨辉三角形.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T10

public class basic_6杨辉三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][];

        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
        }
        // 采用直接赋值的方式
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || i == j) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
