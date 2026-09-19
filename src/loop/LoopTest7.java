package loop;
import java.util.Scanner;
import java.util.Random;

public class LoopTest7 {
    public static void main(String[] args) {
    //注意点:
    // 生成随机数的代码it number=r.nextInt(100)+1;
    // 不能写在循环的里面的，否则每一次都会产生一个新的随机数
    int count=0;
    Random r = new Random();
    int number = r.nextInt(100) + 1;
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("请输入你要猜得数字");
        int gessnumber = sc.nextInt();
        count++;
        if(count==3){
            System.out.println("猜中了");
            break;
        }
        if (gessnumber < number) {
            System.out.println("猜小了");

        } else if (gessnumber > number) {
            System.out.println("猜大了");
        } else {
            System.out.println("恭喜你，猜对了");
            break;
        }
    }
    }






}
