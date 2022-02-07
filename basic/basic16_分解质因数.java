import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/8 0:17
 * @File: basic16_分解质因数.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T57

public class basic16_分解质因数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int k = i;
            int j = 1;
            System.out.print(k + "=");
            while (k != 1) {
                j++;
                // 找到一个因子
                if (k % j == 0) {
                    k /= j;
                    // k分解完毕
                    if (k == 1) {
                        System.out.print(j);
                    } else {
                        System.out.print(j + "*");
                    }
                    j = 1;
                }
            }
            System.out.println();
        }

    }
}
