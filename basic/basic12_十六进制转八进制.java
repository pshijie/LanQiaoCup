import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/7 21:39
 * @File: basic12_十六进制转八进制.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T51

public class basic12_十六进制转八进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 保存输出结果
        String[] arrS = new String[num];
        // 十六进制转换为二进制
        for (int i = 0; i < num; i++) {
            String curS = sc.next();
            StringBuilder sb = new StringBuilder();  // 存储当前十六进制数对应的二进制
            for (int j = 0; j < curS.length(); j++) {
                char curCh = curS.charAt(j);
                // 将当前字符转为二进制字符串
                String binS = Integer.toBinaryString(Integer.valueOf(String.valueOf(curCh), 16));
                // 保证bins有4位二进制
                for (int k = binS.length(); k < 4; k++) {
                    binS = '0' + binS;
                }

                sb.append(binS);
            }

            // 将二进制转换为8进制
            StringBuilder sb1 = new StringBuilder();
            int addZero = 3 - sb.length() % 3;  // 计算需要补0的个数(长度要变为3的倍数)
            // 如果sb1的长度不为3的倍数，就在当前字符串的开头补0使得长度为3的倍数
            for (int j = 0; j < addZero; j++) {
                sb = new StringBuilder("0").append(sb);
            }

            for (int j = 0; j < sb.length(); j += 3) {
                String three = sb.substring(j, j + 3);
                String oct = Integer.toOctalString(Integer.valueOf(String.valueOf(three), 2));
                sb1.append(oct);
            }

            arrS[i] = sb1.toString().replaceAll("^(0+)", "");
        }

        for (int i = 0; i < num; i++) {
            System.out.println(arrS[i]);
        }
    }

}
