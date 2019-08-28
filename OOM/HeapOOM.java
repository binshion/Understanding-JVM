import java.util.ArrayList;
import java.util.List;

/**
 * VM args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * Output:
 * java.lang.OutOfMemoryError: Java heap space
 Dumping heap to java_pid8728.hprof ...
 Heap dump file created [28230988 bytes in 0.099 secs]
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
