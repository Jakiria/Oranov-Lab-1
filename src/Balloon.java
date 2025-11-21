public class Balloon { // класс шарика

    private double radius; // радиус шарика
    private double volume; // объём шарика
    private static double BALLOON_VOLUME_CONST = 1.334; // константа для объёма шарика

    public Balloon() { // конструктор шарика
        this.radius = 0;
        this.volume = 0;
    }

    public double getRadius() { // функция получения радиуса шарика
        return this.radius;
    }

    public void inflate(double amount) { // функция надувания шарика
        if (amount <= 0) {
            System.out.println("Нельзя выпустить воздух из пустого шарика!");
        } else {
            this.radius += amount;
        }
    }

    public double getVolume() { // функция расчёта и получения объёма шарика
        this.volume = BALLOON_VOLUME_CONST * Math.PI * this.radius * this.radius * this.radius;
        return this.volume;
    }
}
