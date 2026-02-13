/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fraction;

/**
 *
 * @author Cerny1-D-3fb4
 */
public class FractionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(1,3);
        
        System.out.println(FractionTools.addFractions(f1,f2).getFraction());
        System.out.println(FractionTools.subtractFractions(f1, f2).getFraction());
        System.out.println(FractionTools.multiplyFractions(f1, f2).getFractionAsString());
        System.out.println(FractionTools.divideFractions(f1, f2).getFractionAsString());
    }
    
}
