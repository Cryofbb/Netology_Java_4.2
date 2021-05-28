public class BMIserviceOxford {
    public double calculate (double height, double weight) {
        return (weight * 1.3) / (Math.pow ((height / 100), 2.5)); // Возврат методики Оксфорда
    }
}
