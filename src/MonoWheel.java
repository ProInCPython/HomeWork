public class MonoWheel extends LandTransport{
    protected int numberOfWheels = 1;
    protected String monoWheelType = "неизвестно";
    protected String musicType = "неизвестно";
    protected int size;

    public String getMonoWheelType() {
        return monoWheelType;
    }

    public void setMonoWheelType(String monoWheelType) {
        this.monoWheelType = monoWheelType;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    // Методы

    @Override
    String insure(String whereToInsure) {
        return "Моноколесо застраховано!";
    }

    @Override
    String park(String whereToPark) {
        return "Моноколесо припарковано здесь: " + whereToPark;
    }

    @Override
    String fixVehicle(String whereToFix) {
        return "Моноколесо починено здесь: " + whereToFix;
    }

    @Override
    String sound() {
        return "Вот едет моноколесо!";
    }

    String makeAStunt(String stuntType) {
        double result = Math.random();
        if(result <= 0.5) {
            return "Трюк не удался...";
        } else {
            return "Поздравляем! Трюк " + stuntType + " выполнен!";
        }
    }

    public String getInfo() {
        return "Количество колёс: " + numberOfWheels + ", марка моноколеса: " + monoWheelType +
                ", музыка: " + musicType + ", вид топлива: " + fuelType + ", размер: " + size +
                ", местонахождение: " + place + ", цвет: " + color +
                ", владелец: " + owner + ", возраст: " + getAge();
    }

}
