package string;

import java.util.Scanner;

/**
 * 模拟用户登录：用户名 + 密码匹配，最多 3 次机会，第 3 次仍失败则锁定账号
 * 演示：判断字符串内容必须用 equals（含 && 短路），不能用 ==
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);

        // 最多 3 次登录机会
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            // 用户名和密码都用 equals 比较内容
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登入成功");
                break;
            } else {
                if (i == 2) {
                    // 第 3 次仍失败：锁定账号
                    System.out.println("账号" + username + "被锁定，请联系黑马程序员小姐姐：xxx-xxxxx");
                } else {
                    // 还有剩余机会：i=0 剩 2 次，i=1 剩 1 次
                    System.out.println("用户登入失败,用户名或密码有误,您还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }
}
