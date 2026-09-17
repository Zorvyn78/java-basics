package loop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
    //1.跳过某一次循环
    for (int i = 1; i <=5; i++) {
        if(i==3){
            continue;
        }
        System.out.println("小老虎在吃第"+i+"个包子");
        
    }
}}
