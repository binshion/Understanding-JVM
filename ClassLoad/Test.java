/**
 * 非法向前引用
 */
public class Test {
    static {
        i = 0;
//        System.out.println(i);  //Illegal forward reference
    }

    static int i = 1;
}
