import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-XX:PermSize=10m -XX:MaxPermSize=10M
 *
 * 使用JDK1.8没问题，因为1.6及以前的版本，常量池分配在永久代；
 * 从1.7开始，逐步“去永久代”
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        //使用list保持着常量池的引用，避免Full GC回收常量池的行为
        List<String> list = new ArrayList<>();
        int i = 0;

        //String.intern()是native方法
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
