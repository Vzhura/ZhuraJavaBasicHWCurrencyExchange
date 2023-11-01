import java.util.Random;

class Bank {
    String name;
    double buyRate;
    double sellRate;

    public Bank(String name) {
        this.name = name;
        Random random = new Random();
        this.buyRate = 35.0 + (40.0 - 35.0) * random.nextDouble(); // Генеруємо випадковий курс купівлі
        this.sellRate = 35.0 + (40.0 - 35.0) * random.nextDouble(); // Генеруємо випадковий курс продажу
    }
}

