public class BMIserviceClassic {
    public double calculate (double height, double weight) {
        return weight / Math.pow ((height / 100), 2); // Возврат классической ИМТ
    }
}
