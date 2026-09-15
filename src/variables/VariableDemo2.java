package variables;
public class VariableDemo2 {
    //主入口
    public static  void main(String[] args){
        //基本用法
        //定义变量，在进行输出
        int a = 10;
        System.out.println(a);
        //2.变量参与计算
        int b = 20;
        int c = 30;
        System.out.println(a+b);
        //3.修改变量记录的值
        a =50;
        System.out.println(a);
        System.out.println("------------------");
        //注意事项:
        //在一条语句中，可以定义多个变量
        int d=100, e=200, f=300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //变量在使用之前必须要赋值
//        int g;
//        g = 500;
        //建议:以后在定义变量的时候，请直接赋值
        //不要把赋值分开写。
        //System.out.println(g);

    }
}
