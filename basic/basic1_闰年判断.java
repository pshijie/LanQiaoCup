import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/7 23:50
 * @File: basic1_闰年判断.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T5

public class basic1_闰年判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
