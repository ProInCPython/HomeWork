public class Car extends LandTransport {
    protected int numberOfWheels = 4;
    protected String carType = "неизвестно";
    protected String gearbox = "неизвестно";

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return "Марка машины: "+ carType;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }
    // Методы

    @Override
    String insure(String whereToInsure) {
        return "Машина застрахована!";
    }

    @Override
    String park(String whereToPark) {
        return "Машина припаркована здесь: " + whereToPark;
    }

    @Override
    String fixVehicle(String whereToFix) {
        return "Машина починена здесь: " + whereToFix;
    }

    @Override
    String sound() {
        return "Бип, это машина!";
    }

    public String getInfo() {
        return "Количество колёс: " + numberOfWheels + ", марка машины: " + carType + ", коробка передач: " +
                gearbox + ", вид топлива: " + fuelType + ", местонахождение: " + place + ", цвет: " +
                color + ", владелец: " + owner + ", возраст: " + getAge();
    }

}
