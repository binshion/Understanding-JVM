import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

class InvokeDynamicTest2 {
    class GrandFather {
        void thinking() {
            System.out.println("I am grandfather");
        }
    }

    class Father extends GrandFather {
        @Override
        void thinking() {
            System.out.println("I am father");
        }
    }

    /**
     * 尝试调用祖类的方法
     */
    class Son extends Father {
        @Override
        void thinking() {
            //jdk 1.7
//            try {
//                MethodType mt = MethodType.methodType(void.class);
//                MethodHandle mh = MethodHandles.lookup().findSpecial(
//                        GrandFather.class,
//                        "thinking",
//                        mt,
//                        getClass());
//                mh.invoke(this);
//            } catch (Throwable e){
//
//            }

            //jdk 1.8
            try {
                MethodType mt = MethodType.methodType(void.class);
                Field IMPL_LOOKUP = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
                IMPL_LOOKUP.setAccessible(true);
                MethodHandles.Lookup lkp = (MethodHandles.Lookup) IMPL_LOOKUP.get(null);
                MethodHandle mh = lkp.findSpecial(GrandFather.class,
                        "thinking",
                        mt,
                        GrandFather.class);
                mh.invoke(this);
            } catch (Throwable e) {

            }
        }
    }

    public static void main(String[] args) {
        ((new InvokeDynamicTest2()).new Son()).thinking();
    }
}
