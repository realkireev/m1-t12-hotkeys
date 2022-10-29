public class Ai92Calculator {
    double ai92price = 42.74;
    double tax = 0.13;
    double fullPrice = ai92price * (1 + tax);

    public double calculate(double volume) {
        return volume * fullPrice;
    }
}
