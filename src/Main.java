public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        short height = 173; // Рост в см
        double weight = 60; // Вес в кг
        double bodyMassIndex = service.calculate(height, weight);
        String formattedBMI = String.format("%.2f", bodyMassIndex);
        System.out.println("Индекс массы тела: " + formattedBMI);
    }
}