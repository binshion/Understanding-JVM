/**
 * VM Args: -verbose:gc
 */
public class ByteCodeEngine {
    /**
     * [GC (System.gc())  70745K->66272K(249344K), 0.0161803 secs]
     [Full GC (System.gc())  66272K->66186K(249344K), 0.0197580 secs]
     * @param args
     */
    public static void main(String[] args) {
        byte[] placeholder = new byte[64 * 1024 * 1024];
        System.gc();
    }
}
