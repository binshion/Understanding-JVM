public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("yes, I'm still alive :)");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    /**
     * 任何对象的finalize()方法只会被系统自动调用一次
     * output:finalize method executed!
     yes, I'm still alive :)
     no, I'm dead :(
     * @param args
     * @throws Throwable
     */
    public static void main(String[] args) throws Throwable {
        SAVE_HOOK = new FinalizeEscapeGC();

        //对象第一次成功拯救自己
        SAVE_HOOK = null;
        System.gc();

        //因为finalize方法优先级很低，所以暂停0.5s等待
        Thread.sleep(500);

        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no, I'm dead :(");
        }

        //第2次
        SAVE_HOOK = null;
        System.gc();

        //因为finalize方法优先级很低，所以暂停0.5s等待
        Thread.sleep(500);

        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no, I'm dead :(");
        }
    }
}
