import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/16 23:08
 * @File: basic19_完美的代价.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T60###

public class basic19_完美的代价 {
    public static int cnt = 0;
    public static boolean haveMiddle = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] chars = sc.next().toCharArray();
        if (palindrome(chars, 0, num - 1)) {
            System.out.println(cnt);
        } else {
            System.out.println("Impossible");
        }
    }

    public static boolean palindrome(char[] chars, int a, int b) {
        if (b <= a) {
            return true;
        }
        for (int i = b; i > a; i--) {
            if (chars[a] == chars[i]) {
                // 比如数组为[1,2,1,5,6]，经过exchange后变为[1,2,5,6,1]，再去递归处理内层
                exchange(chars, i, b);
                cnt += getExchangeTime(i, b);
                return palindrome(chars, a + 1, b - 1);
            }
        }
        // 如果没有出现过中间字符
        if (!haveMiddle) {
            haveMiddle = true;
            cnt += getExchangeTime(a, chars.length / 2);
            return palindrome(chars, a + 1, b);
        }
        return false;
    }

    //把char[a]挨个交换直到char[b]
    public static void exchange(char[] chars, int a, int b) {
        char temp = chars[a];
        for (int i = a; i < b; i++) {
            chars[i] = chars[i + 1];
        }
        chars[b] = temp;
    }

    // 计算交换的次数
    public static int getExchangeTime(int a, int b) {
        return b - a;
    }

}
