public class Main {

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        method4();
    }

    public static void method4() {
        method5();
    }

    public static void method5() {
        Test tst = new Test();
        tst.testmethod1();
    }

    public static String getCallerClassAndMethodName() {
        String inf_out = "";
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
        if (stackTraceElements.length < 3) {
            System.out.println(stackTraceElements[1]);
            return null;
        }
//        for (StackTraceElement element : stackTraceElements) {
        //if (true) {System.out.println("null");return "null";}
        // System.out.println(element.getClassName() + "#" + element.getMethodName());
//        for (int i = 0; i < stackTraceElements.length; i++) {
////            if (i >= 2) {
////
////                inf_out =stackTraceElements[i].getClassName() + "#" + stackTraceElements[i].getMethodName();
////                System.out.println(inf_out);
////                //return inf_out;
//////
////                // }
////            }
        //System.out.println(inf_out);
        //return null;
        System.out.println(stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
    }
}

