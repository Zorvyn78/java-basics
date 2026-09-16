package loop;

public class Test20 {
    public static void main(String[] args) {

    int x = 121;
    int temp = x;
    int num = 0;
    while (x != 0) {
        int ge = x % 10;
        x = x / 10;
        num = num * 10 + ge;
    }
    System.out.println(num);
    System.out.println(num == temp);

//    int x=12;
//    int ge=x%10;
//    int shi=x/10%10;
//    int result =ge*10+shi;
//    System.out.println(result);
}
}
