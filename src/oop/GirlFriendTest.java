package oop;

public class GirlFriendTest {
    static void main(String[] args) {
        GirlFriend[] arr=new GirlFriend[4];
        GirlFriend gf1=new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        GirlFriend gf2=new GirlFriend("小丹丹",19,"萌妹子","玩游戏");
        GirlFriend gf3=new GirlFriend("小慧慧",20,"萌妹子","看书");
        GirlFriend gf4=new GirlFriend("小诗诗",21,"萌妹子","睡觉");

        arr[0]=gf1;
        arr[1]=gf2;
        arr[2]=gf3;
        arr[3]=gf4;
int sum=0;
int count=0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf=arr[i];
            sum=sum+gf.getAge();
        }
        int avg=sum/ arr.length;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf=arr[i];
            if(gf.getAge()<avg){
                count++;
                System.out.println(gf.getName()+","+gf.getAge()+","+gf.getGender()+","+gf.getHobby());
            }
        }
System.out.println(count+"个");
    }
}
