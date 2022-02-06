/**
 * @author psj
 * @date 2022/2/6 23:26
 * @File: basic8_回文数.java
 * @Software: IntelliJ IDEA
 */
// http://lx.lanqiao.cn/problem.page?gpid=T47

public class basic8_回文数 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            StringBuilder s = new StringBuilder(String.valueOf(i));
            if (s.substring(0, 2).equals(s.reverse().substring(0,2))){
                System.out.println(i);
            }
        }
    }
}
