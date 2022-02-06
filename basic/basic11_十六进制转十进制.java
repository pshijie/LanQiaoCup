import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/6 23:59
 * @File: basic11_十六进制转十进制.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T50

public class basic11_十六进制转十进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        long result = 0;  // 如果定义为int类型只有75分
        for (int i = 0; i < len; i++) {
            char c = s.charAt(s.length() - i - 1);
            if (c <= 57){
                result += Math.pow(16, i) * (c - '0');
            }else {
                result += Math.pow(16, i) * (c - 'A' + 10);
            }
        }
        System.out.println(result);
    }
}
