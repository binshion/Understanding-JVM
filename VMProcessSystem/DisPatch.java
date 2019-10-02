public class DisPatch {
    static class QQ {}

    static class _360 {}

    public static class Father {
        public void hardChoice(QQ arg) {
            System.out.println("father choose qq");
        }

        public void hardChoice(_360 arg) {
            System.out.println("father choose 360");
        }
    }

    public static class Son extends Father {
        @Override
        public void hardChoice(QQ arg) {
            System.out.println("son choose qq");
        }

        @Override
        public void hardChoice(_360 arg) {
            System.out.println("son choose 360");
        }
    }

    /**产生两条invokevirtual指令，指令的参数分别为常量池
     * 中指向Father.hardChoice(360)及Father.hardChoice(QQ)
     *
     * 方法的接收者和方法的参数统称为宗量
     *
     * 此处静态分派属于多分派类型：宗量维度为2，静态类型和参数
     * 运行阶段的动态分派属于单分派类型，此时只关注方法的接受者
     * Output:father choose 360
                son choose qq
     *
     * @param args
     */
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        father.hardChoice(new _360());
        son.hardChoice(new QQ());
    }
}
