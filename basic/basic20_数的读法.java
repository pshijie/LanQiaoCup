import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/16 23:36
 * @File: basic20_数的读法.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T61

public class basic20_数的读法 {

    public static String[] arr = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
    public static String[] brr = {"", "shi", "bai", "qian"};
    public static String[] crr = {"", "wan", "yi"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int length = s.length();

        int j;
        // 处理最开始的位数，即第一个逗号前的数，此时假设不到4位
        if (length % 4 != 0) {
            // 第一个逗号前只有两位
            if (length % 4 == 2 && chars[0] == '1') {
                j = chars[1] - 48;
                // 第二位不为0则需要读出来，如果为0则不需要读出来
                if (j != 0) {
                    sb.append(brr[1] + " " + arr[j] + " ");
                } else {
                    sb.append(brr[1] + " ");
                }
            } else {
                for (int i = 0; i < length % 4 - 1; i++) {
                    j = chars[i] - 48;
                    if (j == 0 && chars[i + 1] != '0') {
                        sb.append(arr[0] + " ");
                    } else if (j == 0 && chars[i + 1] == '0') {
                        // 连续两个0就不处理
                    } else {
                        sb.append(arr[j] + " " + brr[length % 4 - 1 - i] + " ");
                    }
                }
                // 判断开始位数的最后一位
                j = chars[length % 4 - 1] - 48;
                if (j != 0) {
                    sb.append(arr[j] + " ");
                }
            }
            // 处理完了第一个逗号前的数
            sb.append(crr[length / 4] + " ");
        }
        int sp = length / 4;
        // 第一个逗号后面每四个数为一个单位
        for (int i = length % 4; i < length; i += 4) {
            for (int k = 0; k < 3; k++) {//对前三个数进行处理
                j = chars[i + k] - 48;
                if (j == 0 && chars[i + k + 1] != '0') {//遇到下一个不是0就添ling
                    sb.append(arr[0] + " ");
                } else if (j == 0 && chars[i + k + 1] == '0') {
                    // 连续两个0不处理
                } else {
                    sb.append(arr[j] + " " + brr[3 - k] + " ");
                }
            }
            sp--;
            //  判断当前4个数的最后一位是否为0,不为0就要读
            j = chars[i + 3] - 48;
            if (j != 0) {
                sb.append(arr[j] + " ");
            }
            sb.append(crr[sp] + " ");
        }
        System.out.println(sb.toString());
    }
}
