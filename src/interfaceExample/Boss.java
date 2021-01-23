package interfaceExample;


public class Boss
{
    public static void main(String[] args) {
        Driver d = new Driver();
        BMW bmw = new BMW();
        Maruti m = new Maruti();
        Audi a = new Audi();
        d.driveCar(bmw);
        d.driveCar(m);
        d.driveCar(a);

        BMW bmw1 = BMWFactory.getModel("123");
        BMW bmw2 = BMWFactory.getModel("456");
        BMW bmw3 = BMWFactory.getModel("789");
        d.driveCar(bmw1);
        d.driveCar(bmw2);
        d.driveCar(bmw3);


    }
}
