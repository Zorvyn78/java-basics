package oop;

public class phoneTest {
    static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("小米", "白色", 1999);
        Phone p2 = new Phone("华为", "蓝色", 4999);
        Phone p3 = new Phone("魅族", "红色", 3999);

        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;
    int sum=0;
        for (int i = 0; i < arr.length; i++) {
        Phone phone=arr[i];
        sum=sum+phone.getPrice();

        }
//        int avg=sum/arr.length;
        double avg2=sum*1.0/ arr.length;
        System.out.println(avg2);
    }
}
