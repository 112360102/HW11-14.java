public class sample3_5
{
    public static void main(string[] args)
    {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.show();
        car1.show();
    }
}

class Car
{
    int num;
    double gas;

    void show()
    {
        system.out.println("車號是" + num);
        system.out.println("汽油量是" + gas);
    }
}