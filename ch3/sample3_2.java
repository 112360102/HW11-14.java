public class sample3_2
{
    public static void main(string[] args)
    {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        system.out.println("車號是" + car1.num);
        system.out,println("汽油量是" + car1.gas);
    }
}

class Car
{
    int num;
    double gas; 
}