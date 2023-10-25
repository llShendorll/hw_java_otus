import hw.otus.annotations.*;

public class AnnotationDemoTest {
    @Before
    public void beforeTest() {
        System.out.println("before");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @After
    @Before
    public void afterTest() {
        System.out.println("after");
    }
}
