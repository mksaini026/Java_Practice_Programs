package interfaceExample;

public class BMW implements PremiumCar, Car
{

    @Override
    public void drive() {
        System.out.println("Driving BMW");
    }
}
