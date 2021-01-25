package interfaceExample;

public class Sancha
{
    public static void main(String[] args) throws Exception {
        Audi a = new Audi();
        System.out.println(Audi.b);
        System.out.println(a.b);
        Audi a1 = a;

        a.a = 21;
        Audi audi = (Audi) a.clone();
        a1.a = 23;
        a1.b = 30;


        System.out.println(audi);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a == a1);
        System.out.println(a == audi);
        System.out.println(a.a);
        System.out.println(a1.a);
        System.out.println(audi.a);
        System.out.println(a.b);
        System.out.println(a1.b);
        System.out.println(audi.b);
    }
}
