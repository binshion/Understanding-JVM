/**
 * 动态对象年龄判定
 * VM Args:-verbose:gc -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=15 -XX:+PrintTenuringDistribution
 */
public class DynamicObjectAge {
    private static final int _1MB = 1024 * 1024;
    public static void testTenuringThreshold2() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[_1MB / 4];  //1 + 2 大于survivor空间的一半
        allocation3 = new byte[_1MB * 4];
        allocation4 = new byte[_1MB * 4];
        allocation4 = null;
        allocation4 = new byte[_1MB * 4];
    }

    public static void main(String[] args) {
        testTenuringThreshold2();
    }
}

/**
 * Output:
 * [GC (Allocation Failure) [DefNew
 Desired survivor size 524288 bytes, new threshold 1 (max 15)
 - age   1:    1048576 bytes,    1048576 total
 : 6759K->1024K(9216K), 0.0033513 secs] 6759K->5259K(19456K), 0.0033834 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 [GC (Allocation Failure) [DefNew
 Desired survivor size 524288 bytes, new threshold 15 (max 15)
 : 5120K->0K(9216K), 0.0010782 secs] 9355K->5259K(19456K), 0.0010907 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 Heap
 def new generation   total 9216K, used 4178K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 eden space 8192K,  51% used [0x00000000fec00000, 0x00000000ff014930, 0x00000000ff400000)
 from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
 tenured generation   total 10240K, used 5259K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 the space 10240K,  51% used [0x00000000ff600000, 0x00000000ffb22e70, 0x00000000ffb23000, 0x0000000100000000)
 Metaspace       used 3469K, capacity 4496K, committed 4864K, reserved 1056768K
 class space    used 381K, capacity 388K, committed 512K, reserved 1048576K
 */