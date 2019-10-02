import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleTest {
    static class ClassA {
        public void println(String s) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Throwable {
        Object obj = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();

        getPrintlnMH(obj).invokeExact("Binshion the Great");
    }

    /**
     * 该方法模拟了invokevirtual指令的执行过程，只是它的分派逻辑并非固话在
     * class文件的字节码上，而是通过一个具体方法来实现。
     * @param receiver
     * @return
     * @throws Throwable
     */
    private static MethodHandle getPrintlnMH(Object receiver) throws Throwable {
        //MethodType：代表“方法类型”，包含了方法的返回值和具体参数
        MethodType mt = MethodType.methodType(void.class, String.class);

        /**用于在指定类中查找符合给定的方法名称、方法类型，并且符合调用权限的方法句柄
        这里调用的是虚方法，方法第一个参数是隐式的，代表改方法的接收者，即this指向的对象，
        这个参数以前放在参数列表中进行传递，而现在提供了bindTo()方法完成这件事
        findVirtual还有其他的findStatic()对应字节码的指令*/
        return MethodHandles.lookup().findVirtual(receiver.getClass(),
                "println", mt).bindTo(receiver);
    }

}
