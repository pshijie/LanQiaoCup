/**
 * @author psj
 * @date 2022/2/6 23:17
 * @File: basic7_特殊的数字.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T46

public class basic7_特殊的数字 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (isSpecial(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isSpecial(int num) {
        int result = 0;
        int temp = num;
        while (num != 0) {
            int k = num % 10;
            num /= 10;
            result += Math.pow(k, 3);
        }

        if (temp == result) {
            return true;
        }
        return false;
    }
}
