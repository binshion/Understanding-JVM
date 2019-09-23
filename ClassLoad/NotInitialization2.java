/**
 * 被动引用示例2
 * 无任何输出，创建动作由字节码newarray触发
 */
public class NotInitialization2 {
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}
