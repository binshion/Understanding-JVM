/**
 * VM Args: -verbose:gc
 */
public class ByteCodeEngine {
    public static void main(String[] args) {
        /**
         * [GC (System.gc())  70745K->66272K(249344K), 0.0161803 secs]
         [Full GC (System.gc())  66272K->66186K(249344K), 0.0197580 secs]
         * @param args
         */
//        byte[] placeholder = new byte[64 * 1024 * 1024];
//        System.gc();

        /**
         * 作用域限制在括号内，依然无法回收
         * 原因：局部变量表中的Slot是否还存有关于placeholder数组对象的引用。
         * 代码虽然离开了作用域，但是在此后无任何对局部变量表的读写操作。
         * placeholder所占用的Slot还未被其他变量所复用，所以作为GC Roots的一部分的
         * 局部变量表仍然保持着对它的关联
         * [GC (System.gc())  70745K->66320K(249344K), 0.0009649 secs]
         [Full GC (System.gc())  66320K->66186K(249344K), 0.0046755 secs]
         */
//        {
//            byte[] placeholder = new byte[64 * 1024 * 1024];
//
//            //“奇技”能使垃圾收集起作用，不使用的对象应手动赋值null
//            //但不推荐作为编码规则，应以恰当变量作用域来控制变量回收时间才是最优雅的解决办法
////            placeholder = null;  //可能JIT编译会被优化消除掉
//        }
//        System.gc();

        /**
         * 此次内存被回收
         * [GC (System.gc())  70745K->66288K(249344K), 0.0009181 secs]
         [Full GC (System.gc())  66288K->650K(249344K), 0.0052574 secs]
         */
//        {
//            byte[] placeholder = new byte[64 * 1024 * 1024];
//        }
//        int a = 0;
//        System.gc();
    }
}
