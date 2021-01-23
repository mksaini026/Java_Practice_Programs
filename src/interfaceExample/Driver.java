package interfaceExample;

public class Driver
{
    void driveCar(Car c)
    {
        if(c instanceof PremiumCar)
        {
            System.out.println("Drive Carefully");
        }
        c.drive();
    }

    void driveCar(Audi a)
    {
        a.drive();
    }
}
