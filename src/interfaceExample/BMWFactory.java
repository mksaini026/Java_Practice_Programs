package interfaceExample;

public class BMWFactory
{

    public static BMW getModel(String model)
    {
        if(model.equals("123"))
        {
            return new BMW123();
        }
        else if(model.equals("456"))
        {
            return new BMW456();
        }
        else
            return new BMW();
    }
}
