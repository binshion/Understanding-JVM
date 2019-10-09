import java.util.ArrayList;
import java.util.List;

public class GenericTypes {
    /**
     * Sun JDK1.6的javac能编译成功，其他的可能拒绝编译（此处就是拒绝编译）
     * @param list
     * @return
     */
    public static String method(List<String> list) {
        System.out.println("invoke method(List<String> list)");
        return "";
    }

//    public static int method(List<Integer> list) {
//        System.out.println("invoke method(List<Integer> list)");
//        return 1;
//    }

    public static void main(String[] args) {
        method(new ArrayList<String>());
//        method(new ArrayList<Integer>());
    }
}
