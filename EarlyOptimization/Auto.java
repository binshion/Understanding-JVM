public class Auto {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        /**
         * -128 - 127使用==有效
         * 自动装箱Integer 的valueOf(int i)方法使用缓存处理-128~127
         */
        System.out.println(c == d);  //true
        System.out.println(e == f);  //false
        System.out.println(c == (a + b));  //true
        System.out.println(c.equals(a + b));  //true
        System.out.println(g == (a + b));  //true
        System.out.println(g.equals(a + b));  //false
    }
}
