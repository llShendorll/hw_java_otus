import hw.otus.annotations.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class UnitTestRunner<T> {

    public void runAllTests(T cls) {
        annotation(cls, Before.class);
        annotation(cls, Test.class);
        annotation(cls, After.class);
    }

    private void annotation(T cls, Class<? extends Annotation> annotationClass) {
        for (Method method : cls.getClass().getMethods()) {
            if (method.isAnnotationPresent(annotationClass)) {
                try {
                    method.invoke(cls);
                } catch (Exception e) {
                    System.out.println("Тест " + method.getName() + " не пройден - " + e.getMessage());
                }
            }
        }
    }
}
