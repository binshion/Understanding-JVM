public class VolatileTest {
    public static volatile int race = 0;

    public static void increase() {
        race++;
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        for (int i = 0; i < THREADS_COUNT; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    increase();
                }
            }).start();
        }

        //等待所有累加线程结束，但是main线程可能也算一个，这里设置为2
        while (Thread.activeCount() > 2)
            Thread.yield();

        System.out.println(race);
    }
}
