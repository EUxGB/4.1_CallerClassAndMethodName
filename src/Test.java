public class Test extends Main {

    String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName(){
        System.out.println(getCallerClassAndMethodName());
        return name;

    }

}

