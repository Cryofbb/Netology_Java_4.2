public class Main {
    public static void main(String[] args) {
        BMIserviceClassic classicBMI = new BMIserviceClassic();
        BMIserviceOxford oxfordBMI = new BMIserviceOxford();
        short height = 186; // Рост в см
        double weight = 115; // Вес в кг
        double classicBodyMassIndex = classicBMI.calculate(height, weight);
        double oxfordBodyMassIndex = oxfordBMI.calculate(height, weight);
        System.out.printf("Индекс массы тела по классической системе: %.2f\n", classicBodyMassIndex);
        System.out.printf("Индекс массы тела по оксфордской системе: %.2f", oxfordBodyMassIndex);
    }
}