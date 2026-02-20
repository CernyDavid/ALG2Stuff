/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendar;

/**
 *
 * @author Cerny1-D-3fb4
 */
public class CalendarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar myCalendar = new Calendar(20,2,2026);
        System.out.println("\nFebruary 2026");
        System.out.println(myCalendar.getCalendar());
        System.out.println("\nMarch 2026");
        myCalendar.nextMonth();
        System.out.println(myCalendar.getCalendar());
        System.out.println("\nJanuary 2026");
        myCalendar.prevMonth();
        myCalendar.prevMonth();
        System.out.println(myCalendar.getCalendar());
        System.out.println("Days in 2026:" + Calendar.getDaysInYear(2026));
        System.out.println("Days in 2028:" + Calendar.getDaysInYear(2028));
    }
    
}
