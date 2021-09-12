package enumStudy;

import java.util.Arrays;

/**
 * @Classname EnumTest
 * @Description TODO
 * @Date 2021-9-12 22:13
 * @Created by xuli
 */
public class EnumTest {
    public static void main(String[] args){
        //直接引用
        enumDemo.Day day = enumDemo.Day.MONDAY;

        WeekDay monday = WeekDay.MONDAY;
        System.out.println(monday+"=====");

        enumDemo.Day[] daysAll = enumDemo.Day.values();
        System.out.println("daysAll:"+ Arrays.toString(daysAll));
        enumDemo.Day dayMonday = enumDemo.Day.valueOf("MONDAY");
        System.out.println("MONDAY:"+dayMonday);

        enumDemo.Day TUESDAY = enumDemo.Day.valueOf("TUESDAY");
        System.out.println("TUESDAY:"+TUESDAY);

    }
}
