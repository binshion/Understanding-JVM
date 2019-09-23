/**
 * 被动引用示例1
 * Output:
 * SuperClass init!
 30

 对于静态字段，只有直接定义这个字段的类才会被初始化
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
