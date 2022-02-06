import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/6 23:38
 * @File: basic10_十进制转十六进制.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T49

public class basic10_十进制转十六进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        char[] hexArr = {'A', 'B', 'C', 'D', 'E', 'F'};

        String result = "";
        if (m == 0){
            System.out.println("0");
        }
        while (m != 0){
            int n = m % 16;
            if (n < 10){
                result = (char)(48 + n) + result;
            }else {
                result = hexArr[n-10] + result;
            }

            m /= 16;
        }

        System.out.println(result);
    }
}
