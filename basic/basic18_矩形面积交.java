import java.util.Scanner;

/**
 * @author psj
 * @date 2022/2/12 20:43
 * @File: basic18_矩形面积交.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T59

public class basic18_矩形面积交 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] x = new double[4];
        double[] y = new double[4];
        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }

        double[] result = new double[4];

        // 不能确定输入的坐标是否是按大小输入
        result[0] = Math.min(Math.max(x[0], x[1]), Math.max(x[2], x[3]));  //重叠面积的右上角的交点x
        result[1] = Math.max(Math.min(x[0], x[1]), Math.min(x[2], x[3]));  //重叠面积的左下角的交点x
        result[2] = Math.min(Math.max(y[0], y[1]), Math.max(y[2], y[3]));  //重叠面积的右上角的交点的y
        result[3] = Math.max(Math.min(y[0], y[1]), Math.min(y[2], y[3]));  //重叠面积的左下角的交点的y

        if (result[0] < result[1] || result[2] < result[3]) {
            System.out.println("0.00");
        } else {
            System.out.printf("%.2f", (result[0] - result[1]) * (result[2] - result[3]));
        }
    }
}
