public class LandTransport {
    protected String fuelType = "неизвестно";
    protected String owner = "никто";
    protected String place = "неизвестно";
    protected String color = "неизвестно";
    protected int age;

    public String getOwner() {
        return owner;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getPlace() {
        return place;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public String getAge() {
        String result = "" + age;
        if (age % 100 >= 11 && age % 100 <= 20) {
            result += " лет";
        } else {
            switch (age % 10) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    result += " лет";
                    break;
                case 1:
                    result += " год";
                    break;
                case 2:
                case 3:
                case 4:
                    result += " года";
                    break;
            }
        }
        return result;
    }

    // Методы

    String refuel(String refuelType) {
        if (refuelType != this.fuelType) {
            return "Неправильный тип топлива!";
        } else {
            return "Заправлено!";
        }
    }

    String move(String moveTo) {
        return "Новое местоположение: " + moveTo;
    }

    String insure(String whereToInsure) {
        return "Транспорт застрахован!";
    }

    String fixVehicle(String whereToFix) {
        return "Транспорт починен!";
    }

    String park(String whereToPark) {
        return "Транспорт припаркован!";
    }

    String sell(String toWhom, int price) {
        owner = toWhom;
        return "Транспорт продан " + toWhom + " за " + price + " денежных единиц.";
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }

    void passYear() {
        this.age += 1;
    }

    String sound() {
        return "бип";
    }

}
