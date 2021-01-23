package interfaceExample;


public class Boss
{
    public static void main(String[] args) throws Exception {
        Driver d = new Driver();
        BMW bmw = new BMW();
        Maruti m = new Maruti();
        Audi a = new Audi();
        d.driveCar(bmw);
        d.driveCar(m);
        d.driveCar(a);

        Audi a1 = a;
        Audi audi = (Audi) a.clone();
        audi.a = 20;
        a.a = 21;
        a1.a = 23;
        System.out.println(audi);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a == a1);
        System.out.println(a == audi);
        System.out.println(a.a);
        System.out.println(a1.a);
        System.out.println(audi.a);


        BMW bmw1 = BMWFactory.getModel("123");
        BMW bmw2 = BMWFactory.getModel("456");
        BMW bmw3 = BMWFactory.getModel("789");
        d.driveCar(bmw1);
        d.driveCar(bmw2);
        d.driveCar(bmw3);


    }
}
