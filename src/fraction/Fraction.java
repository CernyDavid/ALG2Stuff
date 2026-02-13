/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

/**
 *
 * @author Cerny1-D-3fb4
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = num;
        this.denominator = den;
        toSimplified();
    }

    public Fraction(int num) {
        this.numerator = num;
        this.denominator = 1;
    }

    public Fraction(String s) {
        if (s.contains("/")) {
            String[] parts = s.split("/");

            this.numerator = Integer.parseInt(parts[0].trim());
            this.denominator = Integer.parseInt(parts[1].trim());

        } else if (s.contains(" ")) {
            String[] parts = s.split(" ");

            this.numerator = Integer.parseInt(parts[0].trim());
            this.denominator = Integer.parseInt(parts[1].trim());

        } else {
            this.numerator = Integer.parseInt(s);
            this.denominator = 1;
        }

        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

        toSimplified();
    }

    private void toSimplified() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));

        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double getFraction() {
        return (double) numerator / denominator;
    }

    public String getFractionAsString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return numerator + "/" + denominator;
    }
}

