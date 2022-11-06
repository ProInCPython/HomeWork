public class Fraction {
    public int numerator = 0;
    public int denominator = 1;

    // Constructors

    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Division by zero!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(Fraction fraction) {
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
    }

    Fraction(int numerator) {
        this.numerator = numerator;
    }

    Fraction() {
    }

    Fraction(double n){
        int number = 1;
        while (n != (int) n) {
            number *= 10;
            n *= 10;
        }
        this.denominator = number;
        this.numerator = (int) n;
        normalize();
    }

    // Methods

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    void normalize() {
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }

    public void mult(Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
        normalize();
    }

    public void sum(Fraction fraction) {
        this.numerator *= fraction.denominator;
        this.numerator += fraction.numerator * this.denominator;
        this.denominator *= fraction.denominator;
        normalize();
    }

}
