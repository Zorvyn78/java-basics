package exercises;

import java.util.Scanner;

public class ZhlxTest1 {
    public static void main(String[] args) {
        //需求:综合练习——根据机票原价、月份、舱位计算打折后的价格
        //规律:旺季(5~10月)头等舱9折/经济舱8.5折；淡季头等舱7折/经济舱6.5折
        //易错点:getPrice 返回折扣价，调用处必须接收(否则打印的还是原价)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            ticket = getPrice(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            ticket = getPrice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println(ticket);
        sc.close();
    }

    public static int getPrice(int ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
