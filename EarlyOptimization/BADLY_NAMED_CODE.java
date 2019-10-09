/**
 * 操作步骤：
 * 1.切换到当前目录F:\JavaProject\Understanding-JVM\EarlyOptimization>
 * 2.编译2个类到当前目录中
 *         javac -encoding UTF-8 NameChecker.java
 *         javac -encoding UTF-8 NameCheckProcessor.java
 * 3.javac -processor NameCheckProcessor BADLY_NAMED_CODE.java
 */
public class BADLY_NAMED_CODE {
    enum colors {
        red, blue, green;
    }

    static final int _FORTY_TWO = 42;
    public static int NOT_A_CONSTANT = _FORTY_TWO;
    protected void BADLY_NAMED_CODE() {
        return;
    }

    public void NOTcamelCASEmethodNAME() {
        return;
    }
}
