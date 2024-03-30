import java.util.Calendar;
import java.util.Date;

/**
 * A program that calculates how many days a person has lived from his birthdate.
 * The program utilizes the built-in class Day to calculate days Efficiently.
 */
public class Main {
    public static void main(String[] args) {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.MARCH, 4);

        Date birthdate = cal.getTime();

        long livedMilliseconds = today.getTime() - birthdate.getTime();
        long time = 1000 * 60 * 60 * 24;
        long livedDays = livedMilliseconds / time;

        System.out.println("Lived Days: " + livedDays);
    }
}