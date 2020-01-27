import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();

        Test my = new Test("Егор");
        my.getName();

        System.out.println(getCallerClassAndMethodName());
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String message = "";
       // if(stackTraceElements.length >= 3) {
            StackTraceElement element = stackTraceElements[2];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            message = className + ": " + methodName;
       // }
        return message;

    }
}