public class main_oop {
    public static void main(String[] args) {




        car Car = new car();
        Car.setMake("tesla");
        System.out.println("value"+ Car.getMake());
        Car.describecar();

        car Car1 = new car();
        Car1.setMake("vin");
        System.out.println("value1"+ Car1.getMake());
        Car1.describecar();

        car Car0 = new car();
//        Car.setMake("tesla");
        System.out.println("value0"+ Car0.getMake());
        Car0.describecar();
    }
}
