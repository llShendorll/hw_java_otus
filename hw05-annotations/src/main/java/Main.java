public class Main {
    public static void main(String[] args) {
        AnnotationDemoTest demoTest = new AnnotationDemoTest();
        UnitTestRunner<AnnotationDemoTest> unitTestRunner = new UnitTestRunner<>(demoTest);
        unitTestRunner.runAllTests();
    }
}
