/**
 * VM Args:-Xss2M
 *
 * 执行风险：操作系统假死，卡机；暂未未看到执行结果
 */
public class VMStackOutOfMemory {
    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        VMStackOutOfMemory oom = new VMStackOutOfMemory();
        oom.stackLeakByThread();
    }
}
