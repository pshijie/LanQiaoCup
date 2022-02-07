import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/3 18:53
 * @File: basic5_查找整数.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T9

public class basic5_查找整数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (find == a[i]){
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(-1);
    }
}
