public class BodyMassIndex {
    public double calculate (double height, double weight) {
        double meterHeight = height / 100; // Рост из см в м
        return weight / Math.pow (meterHeight, 2); // Возврат классической ИМТ
        //return (weight * 1.3) / (Math.pow (meterHeight, 2.5)); // Возврат методики Оксфорда
    }
}
