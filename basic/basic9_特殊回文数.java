import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/7 0:15
 * @File: basic9_特殊回文数.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T48

public class basic9_特殊回文数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[6];
        for (int i = 10000; i <= 999999; i++) {
            int index = 0;
            int temp = i;
            while (temp != 0) {
                nums[index++] = temp % 10;
                temp /= 10;
            }
            // 当前数为五位数
            if (i < 100000) {

                if (nums[0] + nums[1] + nums[2] + nums[3] + nums[4] == n) {
                    int left = nums[1] + 10 * nums[0];
                    int right = nums[4] * 10 + nums[3];
                    if (left == right) {
                        System.out.println(i);
                    }
                }
            }
            // 当前数为六位数
            else {
                if (nums[0] + nums[1] + nums[2] + nums[3] + nums[4] + nums[5] == n) {
                    int left = nums[2] + 10 * nums[1] + 100 * nums[0];
                    int right = nums[5] * 100 + 10 * nums[4] + nums[3];
                    if (left == right) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
