public class Test extends Main {

    public static void testmethod1(){
        testmethod2();
    }
    public static void testmethod2(){
        testmethod3();
    }
    public static void testmethod3(){
        getCallerClassAndMethodName();
    }
}
