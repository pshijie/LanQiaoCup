import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/7 23:59
 * @File: basic14_时间转换.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T54

public class basic14_时间转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hour = time / 3600;
        time = time % 3600;
        int minute = time / 60;
        time = time % 60;
        int second = time;
        System.out.println("" + hour + ":" + minute + ":" + second);
    }
}
