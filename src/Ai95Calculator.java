public class Ai95Calculator {
    double ai95price = 46.35;
    double tax = 0.14;
    double fullPrice = ai95price * (1 + tax);

    public double calculate(double volume) {
        return volume * fullPrice;
    }
}
