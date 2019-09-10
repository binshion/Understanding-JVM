/**
 * VM args:-verbose:gc -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 */
public class SurvivorAge {
    private static final int _1MB = 1024 * 1024;

    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];

        //何时进入老年代取决于XX:MaxTenuringThreshold的设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testTenuringThreshold();
    }
}

/**
 * Output:
 [GC (Allocation Failure) [DefNew
 Desired survivor size 524288 bytes, new threshold 1 (max 1)
 - age   1:     929360 bytes,     929360 total
 : 6503K->907K(9216K), 0.0036108 secs] 6503K->5003K(19456K), 0.0036422 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
 [GC (Allocation Failure) [DefNew
 Desired survivor size 524288 bytes, new threshold 1 (max 1)
 : 5003K->0K(9216K), 0.0013098 secs] 9099K->4999K(19456K), 0.0013332 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 Heap
 def new generation   total 9216K, used 4178K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 eden space 8192K,  51% used [0x00000000fec00000, 0x00000000ff014930, 0x00000000ff400000)
 from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
 tenured generation   total 10240K, used 4999K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 the space 10240K,  48% used [0x00000000ff600000, 0x00000000ffae1ec8, 0x00000000ffae2000, 0x0000000100000000)
 Metaspace       used 3469K, capacity 4496K, committed 4864K, reserved 1056768K
 class space    used 381K, capacity 388K, committed 512K, reserved 1048576K


 [GC (Allocation Failure) [DefNew
 Desired survivor size 524288 bytes, new threshold 1 (max 15)
 - age   1:     929360 bytes,     929360 total
 : 6503K->907K(9216K), 0.0034164 secs] 6503K->5003K(19456K), 0.0034488 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 [GC (Allocation Failure) [DefNew
 Desired survivor size 524288 bytes, new threshold 15 (max 15)
 : 5003K->0K(9216K), 0.0011266 secs] 9099K->5003K(19456K), 0.0011391 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 Heap
 def new generation   total 9216K, used 4178K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 eden space 8192K,  51% used [0x00000000fec00000, 0x00000000ff014930, 0x00000000ff400000)
 from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
 tenured generation   total 10240K, used 5003K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 the space 10240K,  48% used [0x00000000ff600000, 0x00000000ffae2e60, 0x00000000ffae3000, 0x0000000100000000)
 Metaspace       used 3470K, capacity 4496K, committed 4864K, reserved 1056768K
 class space    used 381K, capacity 388K, committed 512K, reserved 1048576K
 */

