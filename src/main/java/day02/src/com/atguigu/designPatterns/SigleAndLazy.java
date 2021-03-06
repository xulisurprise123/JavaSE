package day02.src.com.atguigu.designPatterns;

/**
 * @author 徐莉
 * @Classname SigleAndLazy
 * @Description TODO
 * @Date 2021-9-12 20:09
 * @Created by xuli
 */


/***
 * 按字面意思可以更简单的理解单例模式：在一个类中只有一个实例，并且提供了一个公共的全局方法。
 *
 * 可以看出它的构造器是私有的，
 * 所以只能自己实例化，
 * 如果外部想要获得他的实例化对象，
 * 我们可以看到它的方法名是静态的，
 * 可以通过类名.方法名获取实例化对象
 */


/**
 * 饿汉模式：
 * 从代码中可以看到Singleton这个人有多饥饿了吧？
 * 在属性中它便把自己实例化了一次，也就是在类加载的同时，它就开始找食物并且吃掉它。
 *
 * 优点
 * 因为类只加载一次，并且它在类加载的时候，它已经实例化了自己，
 * 虽然说类加载的慢一点，但是他是线程安全的。
 * 这种模式适合于要求对象初始化非常快，而且占用内存非常小的时候。
 *
 * 缺点
 * 类加载的时间相对会长一点。
 * 在某种特定的场合中，单例模式是不需要创建对象的，
 * 所以类加载的同时加载对象会浪费内存空间。
 */
public class SigleAndLazy {
    //饿汉模式
    private static final SigleAndLazy singleton = new SigleAndLazy();

    private SigleAndLazy() {

    }

    public static SigleAndLazy getInstance() {
        return singleton;
    }
}


/**
 * 再来看一下我们的懒汉模式，类加载的时候并没有实例化，而是在静态方法体中，
 * 做了一个判断，然后才决定它是否要实例化，按照单线程的思维，
 * 这种方法也是可取的，延迟了实例化，并且实例化一次之后不会继续实例化，
 * 减少了内存空间的占用。
 *
 *但是！！！如果按照多线的思维，这种做法线程是不安全的，从宏观角度看，
 * 两个线程同时进入判断条件里，这样可能会造成创建出多个对象，
 * 占用大量的内存，所以我们还要改进代码，就是要给它加一个线程锁，并发执行。
 *
 *
 * 这样是不是就很安全了？加了线程锁之后，只能一个线程执行完锁里面的内容才可以执行下一个线程了，
 * 这样也就不会创建出多个对象了。可这个代码还需要解释的一点就是为什么要加双重的判断呢？
 * 把这个锁放在一个判断里面可以吗？或者放在一个判断外面呢？
 *
 * 锁在判断内：如果锁在判断内的话，我们想一下是不是这个锁就没什么作用了呀？有跟没有一个样子，所以pass。
 *
 * 锁在判断外：这样更有意思了，每次都要访问同步锁，虽然说比较安全了，但是这速度未免也太慢了吧。pass
 *
 * 优点
 * 从代码中可以看出，相对于饿汉模式，懒汉模式不会再类加载中创建实例化对象，
 * 只会在你需要它的时候它才会出现，这样想的话这种模式会不会更有用呀？
 * 跟上述最简易的懒汉模式一样，它加载完一次对象之后就不会加载了，只会调用。
 *
 * 缺点
 * 本来第一个懒汉模式的代码是有很大的线程安全问题的，但是经过修改之后并不是有很大问题了。
 * 所以说它现在跟饿汉模式的区别就是你是否要在虚拟机加载时候就加载它，
 * 还是延迟加载（在你需要的时候加载它）。
 */

//懒汉模式
 class Singleton {

    private static Singleton singleton = null;

    private Singleton() {

    }
    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized (singleton) {
                if(singleton == null) {
                    return new Singleton();
                }
                return singleton;
            }
        }
        return singleton;
    }
}