package method;

public class MethodTest10 {
    public static void main(String[] args) {
        //需求:方法传引用——数组(引用类型)作为参数，传递的是地址值
        //现象:方法里把 arr[1] 改成 200，外面跟着变(打印出来是 200)
        //结论:引用类型传参传的是地址，方法内通过地址改数据，会影响调用处的数组
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前:" + arr[1]);
        change(arr);
        System.out.println("调用后change方法后:" + arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
