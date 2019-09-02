import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * VM Args:-Xmx20M -XX:MaxDirectMemorySize=10M
 *
 * 执行卡机。。谨慎操作
 */
public class DirectMemoryOOM {
    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        while (true) {
            unsafe.allocateMemory(1024L);
        }
    }
}
