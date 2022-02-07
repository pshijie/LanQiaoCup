import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/3 18:41
 * @File: basic3_字母图形.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T7

public class basic3_字母图形 {
    public static void main(String[] args) {
        // 图形规律为该数字所在位置的行与列的差值的绝对值
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((char) ('A' + Math.abs(i - j)));
            }
            System.out.println();
        }
    }
}
