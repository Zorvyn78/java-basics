package loop;

public class ZhlxTest2 {
    public static void main(String[] args) {
        //需求:综合练习——统计 101~200 之间有多少个质数并打印
        //思路:外层循环遍历 101~199，内层循环从 2 试除到 i-1，能被整除就不是质数
        //优化:找到因子立刻 break，内层没找到因子(flag 仍为 true)就是质数
        int count = 0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是质数");
                count++;
            }
        }
        System.out.println("一共有" + count + "个质数");
    }
}
