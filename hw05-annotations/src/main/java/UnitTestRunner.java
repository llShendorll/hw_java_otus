import hw.otus.annotations.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class UnitTestRunner<T> {

    private final T cls;

    public UnitTestRunner(T cls) {
        this.cls = cls;
    }

    public void runAllTests() {
        annotation(Before.class);
        annotation(Test.class);
        annotation(After.class);
    }

    private void annotation(Class<? extends Annotation> annotationClass) {
        for (Method method : cls.getClass().getMethods()) {
            if (method.isAnnotationPresent(annotationClass)) {
                try {
                    method.invoke(cls);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
