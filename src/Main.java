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
        StackTraceElement[] stExceptions = new Exception().getStackTrace();     //1.    // or  new Throwable().getStackTrace()
//        try {
//            StackTraceElement element = new Throwable().getStackTrace()[2];
//            return element.getClassName() + "#" + element.getMethodName();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            return null;
//        }
        StackTraceElement[] stThreads = Thread.currentThread().getStackTrace(); //2.
//        if (st.length<=3) { //условие, что вызвали из точки входа
//            return null;
//        } else{
//            return st[3].getClassName() + "#" + st[3].getMethodName();
//        }
//    }
        //1.
        int i = 0;
        System.out.println("\n" + "использование Exception().getStackTrace()" + "\n" + "******************************************");
        for (StackTraceElement el : stExceptions) {
            System.out.println(i++ + ":" + el.getClassName() + "#" + el.getMethodName());

        }
        //2.
        i = 0;
        System.out.println("\n" + "использование Thread.currentThread().getStackTrace()" + "\n" + "******************************************");
        //st[0] это то, что был вызван сам getStackTrace, st[1] то что был вызван currentThread(),  st[2] - тот метод выяснить у которого нам надо откуда вызван, st[3]  то, что нам нужно
        for (StackTraceElement el : stThreads) {
            System.out.println(i++ + ":" + el.getClassName() + "#" + el.getMethodName());
        }
        return null;
    }

}


