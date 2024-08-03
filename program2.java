
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


class Program2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern( "EEEE, d. MMMM, YYYY" );
        System.err.println("Today is " + myFormat.format(now) + "!");
    }
}