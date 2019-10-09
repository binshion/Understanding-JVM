import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("*")
public class NameCheckProcessor extends AbstractProcessor {
    private NameChecker nameChecker;

    /**
     * 初始化名称检查插件
     * */
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        nameChecker = new NameChecker(processingEnv);
    }

    /**
     * 对输入的各语法树节点进行名称检查
     * */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        //判断节点是否存在
        if (!roundEnv.processingOver()) {
            //循环节点进行名称检查
            for (Element element : roundEnv.getRootElements()) {
                nameChecker.checkNames(element);
            }
        }
        return false;
    }
}
