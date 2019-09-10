/**
 * VM Args:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *
 * Output:
 * [GC (Allocation Failure) [PSYoungGen: 6248K->792K(9216K)] 6248K->4896K(19456K), 0.0019754 secs] [Times: user=0.00 sys=0.00, real=0.03 secs]
 Heap
 PSYoungGen      total 9216K, used 7173K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 eden space 8192K, 77% used [0x00000000ff600000,0x00000000ffc3b588,0x00000000ffe00000)
 from space 1024K, 77% used [0x00000000ffe00000,0x00000000ffec6030,0x00000000fff00000)
 to   space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
 ParOldGen       total 10240K, used 4104K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 object space 10240K, 40% used [0x00000000fec00000,0x00000000ff002020,0x00000000ff600000)
 Metaspace       used 3470K, capacity 4496K, committed 4864K, reserved 1056768K
 class space    used 381K, capacity 388K, committed 512K, reserved 1048576K
 */
public class MinorGC {
    private static final int _1MB = 1024 * 1024;
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];

        /**
         * 使用了6M，还剩3M可用（8M Eden和1M动态Survivor），触发一次Minor GC
         * Survivor区只有1M不够放2M的单个对象，分配担保转移到老年代
         */
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
