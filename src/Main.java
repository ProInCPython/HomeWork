public class Main {
    public static void main(String[] args) {

        LandTransport vehicle = new LandTransport();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        MonoWheel monoWheel = new MonoWheel();
        System.out.println(car.getInfo());
        System.out.println(bicycle.getInfo());
        System.out.println(monoWheel.getInfo());
    }
}