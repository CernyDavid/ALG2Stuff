/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

/**
 *
 * @author Cerny1-D-3fb4
 */
public class FractionTest {
    
    public static void main(String[] args) {
        Fraction myFr = new Fraction(2,3);
        Fraction myFr1 = new Fraction(5);
        Fraction myFr2 = new Fraction("2/6");
        
        System.out.println(myFr.getNumerator());
        System.out.println(myFr.getDenominator());
        System.out.println(myFr1.getFraction());
        System.out.println(myFr2.getFractionAsString());
    }
    
}
