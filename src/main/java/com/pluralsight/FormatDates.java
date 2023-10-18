package com.pluralsight;
import java.time.LocalDateTime;
import  java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime presentDT = LocalDateTime.now(); // Get Date and Time
        DateTimeFormatter dFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // DateTimeFormatter /order
        DateTimeFormatter dFormat2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dFormat3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter dFormat4 = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy HH:mm");
        DateTimeFormatter lFormat = DateTimeFormatter.ofPattern("HH:mm 'on' yyyy-MM-dd"); // Local Time Zone "LTZ"
        String lineDate1 = presentDT.format(dFormat1); // Format date and time
        String lineDate2 = presentDT.format(dFormat2);
        String lineDate3 = presentDT.format(dFormat3);
        String lineDate4 = presentDT.format(dFormat4);
        String lineDate5 = presentDT.format(lFormat);
        System.out.println(lineDate1); // Display
        System.out.println(lineDate2);
        System.out.println(lineDate3);
        System.out.println(lineDate4);
        System.out.println(lineDate5);
    }
}
