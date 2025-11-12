public class Sample3_7 {
    public static void main(String[] args) {
        { 
            Car car1;
            car1 = new Car();

            int num = 1234; 
            car1.setNum(num); 

            car1.setNum(1234);
            car1.setGas(20.5); 
        }
    } 
}


class Car {
    int num;
    double gas; 

    void setNum(int n) {
        num = n;
        System.out.println("給車號設為" + num); 
    }

    void setGas(double g) {
        gas = g;
        System.out.println("給汽油量設為" + gas);
    }
}

