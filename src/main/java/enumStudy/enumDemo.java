package enumStudy;/**
 * @Classname enumDemo
 * @Description TODO
 * @Date 2021-9-12 22:10
 * @Created by xuli
 */


/***
 * 一、理解枚举类型
 * 枚举类型是Java 5中新增特性的一部分，它是一种特殊的数据类型，
 * 之所以特殊是因为它既是一种类(class)类型却又比类类型多了些特殊的约束，
 * 但是这些约束的存在也造就了枚举类型的简洁性、安全性以及便捷性。
 * 下面先来看看如何写一个枚举？
 *
 */
public class enumDemo {
    public static final int MONDAY =1;
    public static final int TUESDAY=2;
    public static final int WEDNESDAY=3;
    public static final int THURSDAY=4;
    public static final int FRIDAY=5;
    public static final int SATURDAY=6;
    public static final int SUNDAY=7;

    /***
     * 上述的常量定义常量的方式称为int枚举模式，这样的定义方式并没有什么错，但它存在许多不足，
     * 如在类型安全和使用方便性上并没有多少好处，如果存在定义int值相同的变量，容易混淆，
     * 因此这种方式在枚举出现后并不提倡，现在我们利用枚举类型来重新定义上述的常量，定义周一到周日的常量
     * 枚举类型，使用关键字enum
     *
     *
     * 相当简洁，在定义枚举类型时我们使用的关键字是enum，与class关键字类似，
     * 只不过前者是定义枚举类型，后者是定义类类型。
     * 枚举类型Day中分别定义了从周一到周日的值，这里要注意，值一般是大写的字母，
     * 多个值之间以逗号分隔。同时我们应该知道的是枚举类型可以像类(class)类型一样，
     * 定义为一个单独的文件，当然也可以定义在其他类内部，
     * 更重要的是枚举常量在类型安全性和便捷性都很有保证，
     * 如果出现类型问题编译器也会提示我们改进，
     * 但务必记住枚举表示的类型其取值是必须有限的，
     * 也就是说每个值都是可以枚举出来的，比如上述描述的一周共有七天。
     */

    /**
     * values()方法和valueOf(String name)方法是编译器生成的static方法，
     * 后面我们自己定义的枚举类的父类Enum的分析中，在Enum类中并没出现values()方法，
     * 但valueOf()方法还是有出现的，只不过编译器生成的valueOf()方法需传递一个name参数，
     * 而Enum自带的静态方法valueOf()则需要传递两个方法，从前面反编译后的代码可以看出，
     * 编译器生成的valueOf方法最终还是调用了Enum类的valueOf方法，
     * 下面通过代码来演示这两个方法的作用：
     */

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
