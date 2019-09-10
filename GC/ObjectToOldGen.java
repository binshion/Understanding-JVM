/**
 * VM args:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728 -XX:+UseSerialGC
 *
 * Output:使用了Parallel Scavenge收集器不认识这个参数,故额外加参数强制使用SerialGC
 */
public class ObjectToOldGen {
    private static final int _1MB = 1024 * 1024;

    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
