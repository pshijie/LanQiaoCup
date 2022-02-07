import java.util.Arrays;
import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/7 22:14
 * @File: basic13_数列排序.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T52

public class basic13_数列排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer[] arr = new Integer[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
