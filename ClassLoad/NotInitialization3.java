/**
 * 被动引用示例3
 * 常量在编译阶段会存入调用类的常量池中
 * 在编译阶段通过常量传播优化，将ConstClass的常量的值-hello world
 * 存储到了NotInitialization3类的常量池中，以后该类对
 * ConstClass.HELLO的引用时机被转化为多自己类对自身常量池的引用
 *
 * 这两个类在编译成class之后就不能存在任何联系了。
 */
public class NotInitialization3 {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLO);
    }
}
