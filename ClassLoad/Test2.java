/**
 * 模拟一条线程在死循环以模拟长时间操作，另外一条线程在阻塞等待
 *
 * 虚拟机会保证一个类的<clint>()方法在多线程环境中被正确地加锁、同步，
 * 如果多个线程同时去初始化一个类，那么只会有一个线程去执行这个类的<clint>()方法
 */
public class Test2 {
    static class DeadLoopClass{
        static {
            if (true) {  //注释if的话将拒绝编译
                System.out.println(Thread.currentThread() + "init DeedLoopClass");
                while (true){
                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "start");
                DeadLoopClass dlc = new DeadLoopClass();
                System.out.println(Thread.currentThread() + " run over");
            }
        };

        Thread thread1 = new Thread(script);
        Thread thread2 = new Thread(script);
        thread1.start();
        thread2.start();
    }
}
