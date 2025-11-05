package Constructor;

public class Test {

    public static void main(String[] args) throws Exception {
        new Demo().m1();

        //Class<?> c = Class.forName(Demo.class.getName()); or below line
        Class<?> c = Class.forName("Constructor.Demo");
        Demo d1 = (Demo) c.newInstance();   //deprecated Class.newInstance()
        d1.m1();
        Demo d = (Demo) c.getDeclaredConstructor().newInstance();
        d.m1();
    }
}
