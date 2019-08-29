/**
 * VM Args:-Xss128k
 */
public class VMStackStackOverFlow {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        VMStackStackOverFlow oom = new VMStackStackOverFlow();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
