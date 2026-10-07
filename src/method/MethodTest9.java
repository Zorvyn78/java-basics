package method;

public class MethodTest9 {
    public static void main(String[] args) {
        //需求:方法传值——基本类型作为参数，传递的是值的拷贝
        //现象:方法里把 number 改成 200，外面不受影响(调用处仍是 100)
        //结论:基本数据类型传参是"值传递"，方法内修改不影响实参
        int number = 100;
        System.out.println("调用change方法前:" + number);
        number = change(number);
        System.out.println("调用change方法后:" + number);
    }

    public static int change(int number) {
        number = 200;
        return number;
    }
}
