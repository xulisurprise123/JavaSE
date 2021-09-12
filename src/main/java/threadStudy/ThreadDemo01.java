package threadStudy;/**
 * @Classname ThreadDemo01
 * @Description TODO
 * @Date 2021-9-12 17:18
 * @Created by xuli
 */
public class ThreadDemo01 extends Thread {
    public ThreadDemo01(String name){
        super();
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            Thread thread = Thread.currentThread();
            String name = thread.getName();
            System.out.println(name+"现在开始循环打印数字=====================第"+i+"个");
        }
    }

    public static void main(String[] args) {
        ThreadDemo01 threadDemoA = new ThreadDemo01("我是A");
        ThreadDemo01 threadDemoB = new ThreadDemo01("我是B");
        threadDemoA.start();
        threadDemoB.start();
    }
}