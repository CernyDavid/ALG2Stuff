/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calendar;

/**
 *
 * @author Cerny1-D-3fb4
 */
public class Calendar {
    public enum Day {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    }
    
    private int day;
    private int month;
    private int year;
    
    private static final int[] numDaysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Calendar(int d, int m, int y) {
        if (m > 12 || m < 1) throw new IllegalArgumentException("Invalid month.");
        this.day = d;
        this.month = m;
        this.year = y;
    }
    
    public static Day getDayOfTheWeek(int d, int m, int y) {
        if (m > 12 || m < 1) throw new IllegalArgumentException("Invalid month.");
        if (d > getDaysInMonth(m,y) || d < 1) throw new IllegalArgumentException("Invalid day.");
        if (m < 3) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        return switch (h) {
            case 0 -> Day.Saturday;
            case 1 -> Day.Sunday;
            case 2 -> Day.Monday;
            case 3 -> Day.Tuesday;
            case 4 -> Day.Wednesday;
            case 5 -> Day.Thursday;
            case 6 -> Day.Friday;
            default -> Day.Monday;
        };
    }
    
    public String getCalendar() {
        StringBuilder sb = new StringBuilder();

        sb.append("Mo Tu We Th Fr Sa Su\n");
        int daysInMonth = getDaysInMonth(this.month, this.year);
        
        Day firstDay = getDayOfTheWeek(1, this.month, this.year);
        int startIndex = firstDay.ordinal();
        
        for (int i = 0; i < startIndex; i++) {
            sb.append("   ");
        }
        
        for (int i = 1; i <= daysInMonth; i++) {

            sb.append(i);
            if (i > 9) sb.append(" ");
            else sb.append("  ");

            if ((i + startIndex) % 7 == 0) {
                sb.append("\n");
            }
        }
        
        return sb.toString();
    }
    
    public void nextMonth() {
        this.month++;
        if (this.month > 12) {
            this.month = 1;
            this.year++;
        }
        this.day = 1;
    }
    
    public void prevMonth() {
        this.month--;
        if (this.month < 1) {
            this.month = 12;
            this.year--;
        }
        this.day = 1;
    }
    
    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
    
    public static int getDaysInYear(int y) {
        return isLeapYear(y) ? 366 : 365;
    }
    
    public static int getDaysInMonth(int m, int y) {
        if (m > 12 || m < 1) throw new IllegalArgumentException("Invalid month.");
        if (m == 2 && isLeapYear(y)) {
            return 29;
        }
        return numDaysInMonths[m - 1];
    }
}
