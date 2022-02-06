import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/3 18:48
 * @File: basic_4数列特征.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T8
public class basic_4数列特征 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            sum += cur;
            if (cur < min){
                min = cur;
            }
            if (cur > max){
                max = cur;
            }
        }

        System.out.print(max + "\n" + min + "\n" + sum);
    }
}
