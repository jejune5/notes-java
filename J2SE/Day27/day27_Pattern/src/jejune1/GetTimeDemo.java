package jejune1;

/**
 * Created by Jejune on 2018/7/15.
 */
public class GetTimeDemo {
    public static void main(String[] args) {
//        GetTime gt = new GetTime();
//        System.out.println(gt.getTime()+" 毫秒");

        GetTime gt = new ForDemo();
        System.out.println(gt.getTime() + "毫秒");

        gt = new IODemo();
        System.out.println(gt.getTime()+ "毫秒");

    }
}
