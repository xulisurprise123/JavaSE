package threadStudy;

/**
 * @Classname SaleTickets
 * @Description TODO
 * @Date 2021-9-12 19:25
 * @Created by xuli
 */
public class SaleTickets implements Runnable {

    private int tickets = 100;

    @Override
    public void run() {
            while (true){
                synchronized (this){
                if (tickets>0){
                        try {
                            Thread.sleep(100);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"正在售卖第"+(tickets+"张票"));
                        tickets--;
                }else {
                    break;
                }
            }
        }

    }


    public static void main(String[] args) {
        SaleTickets saleTickets = new SaleTickets();
        Thread A= new Thread(saleTickets);
        Thread B= new Thread(saleTickets);
        Thread C= new Thread(saleTickets);
        A.setName("窗口1");
        B.setName("窗口2");
        C.setName("窗口3");
        A.start();
        B.start();
        C.start();
    }
}
