package method;

public class MethodDemo1 {
    public static void main(String[] args) {
        //需求:定义一个方法，模拟打游戏的流程
        //调用两次，体会"方法定义一次，可以调用多次"
        playGame();
        playGame();
    }

    public static void playGame() {
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }
}
