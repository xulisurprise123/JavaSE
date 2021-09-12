package enumStudy;/**
 * @Classname aa
 * @Description TODO
 * @Date 2021-9-12 22:20
 * @Created by xuli
 */
public class EnumStudy {
    public static void main(String[] args) {
        //创建枚举数组
        WeekDay[] days = new WeekDay[]{WeekDay.MONDAY, WeekDay.TUESDAY, WeekDay.WEDNESDAY,
                WeekDay.THURSDAY, WeekDay.FRIDAY, WeekDay.SATURDAY, WeekDay.SUNDAY};
        for (int i = 0; i < days.length; i++) {
            System.out.println("day[" + i + "].ordinal():" + days[i].ordinal());
        }

        System.out.println("-------------------------------------");
        //通过compareTo方法比较,实际上其内部是通过ordinal()值比较的
        System.out.println("days[0].compareTo(days[1]):" + days[0].compareTo(days[1]));
        System.out.println("days[0].compareTo(days[1]):" + days[0].compareTo(days[2]));

        //获取该枚举对象的Class对象引用,当然也可以通过getClass方法
        Class<?> clazz = days[0].getDeclaringClass();
        System.out.println("clazz:" + clazz);

        System.out.println("-------------------------------------");

        //name()
        System.out.println("days[0].name():" + days[0].name());
        System.out.println("days[1].name():" + days[1].name());

        System.out.println("-------------------------------------");

        System.out.println("days[0].toString():" + days[0].toString());
        System.out.println("days[1].toString():" + days[1].toString());

        System.out.println("-------------------------------------");

        WeekDay d = Enum.valueOf(WeekDay.class, days[0].name());
        WeekDay d2 = WeekDay.valueOf(WeekDay.class, days[0].name());
        System.out.println("d:" + d);
        System.out.println("d2:" + d2);
    }
}
