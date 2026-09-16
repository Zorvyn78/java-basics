package loop;

public class Test16 {
    public static void main(String[] args) {
 int sum=0;
 for(int i=1;i<=5;i++){
     // 1.求和的变量不能定义在循环的里面，因为变量只在所属的大括号中有效
     //2.如果我们把变量定义在循环的里面，那么当前变量只能在本次循环中有效。
//当本次循环结束之后，变量就会从内存中消失。
     //二次循环开始的时候，又会重新定义一个新的变量。
     //结论:如果以后我们要写累加求和的变量。可以把变量定义在循环的外面。
     System.out.println(i);
     sum=sum+i;
 }
 System.out.println(sum);
}}
