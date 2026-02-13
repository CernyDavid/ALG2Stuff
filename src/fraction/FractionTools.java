/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

/**
 *
 * @author Cerny1-D-3fb4
 */
public class FractionTools {
    private FractionTools() {};
    
    static Fraction addFractions(Fraction f1, Fraction f2) {
        int numerator = f1.getNumerator() * f2.getDenominator()
                      + f2.getNumerator() * f1.getDenominator();
        int denominator = f1.getDenominator() * f2.getDenominator();
        return new Fraction(numerator, denominator);
    }

    static Fraction subtractFractions(Fraction f1, Fraction f2) {
        int numerator = f1.getNumerator() * f2.getDenominator()
                      - f2.getNumerator() * f1.getDenominator();
        int denominator = f1.getDenominator() * f2.getDenominator();
        return new Fraction(numerator, denominator);
    }

    static Fraction multiplyFractions(Fraction f1, Fraction f2) {
        int numerator = f1.getNumerator() * f2.getNumerator();
        int denominator = f1.getDenominator() * f2.getDenominator();
        return new Fraction(numerator, denominator);
    }

    static Fraction divideFractions(Fraction f1, Fraction f2) {
        int numerator = f1.getNumerator() * f2.getDenominator();
        int denominator = f1.getDenominator() * f2.getNumerator();
        return new Fraction(numerator, denominator);
    }
}
