package interfaceExample;

public class Audi implements Car, Cloneable
{
    public static int b = 20;

    public int a = 10;
    //@Override
    public void drive() {
        System.out.println("Driving Audi");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO: Your custom clone logic
        return super.clone();
    }

}
