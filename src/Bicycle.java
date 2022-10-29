public class Bicycle extends LandTransport {
    protected int numberOfWheels = 2;
    protected String BicycleType = "неизвестно";
    protected boolean withGears = true;
    protected int size;
    protected int gear = 3;
    protected int numberOfGears = 7;

    public void setBicycleType(String bicycleType) {
        BicycleType = bicycleType;
    }

    public String getBicycleType() {
        return BicycleType;
    }

    public void setWithGears(boolean withGears) {
        this.withGears = withGears;
    }

    public boolean isWithGears() {
        return withGears;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    // Методы

    @Override
    String insure(String whereToInsure) {
        return "Велосипед застрахован!";
    }

    @Override
    String park(String whereToPark) {
        return "Велосипед припаркован здесь: " + whereToPark;
    }

    @Override
    String fixVehicle(String whereToFix) {
        return "Велосипед починен здесь: " + whereToFix;
    }

    @Override
    String sound() {
        return "*звонок*, это велосипед!";
    }

    void upGear() {
        if (withGears) {
            if (gear != 8) {
                this.gear += 1;
            }
        }
    }

    void downGear() {
        if (withGears) {
            if (gear != 1) {
                this.gear -= 1;
            }
        }
    }

    public String getInfo() {
        return "Количество колёс: " + numberOfWheels + ", марка велосипеда: " + BicycleType +
                ", с передачами: " + (withGears ? "да" : "нет") + ", количество передач: " + numberOfGears +
                ", вид топлива: " + fuelType + ", размер: " + size + ", местонахождение: " + place +
                ", цвет: " + color + ", владелец: " + owner +
                ", возраст: " + getAge();
    }

}
