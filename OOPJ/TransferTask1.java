import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class TransferTask1 {
    public static void main(String[] args) {
        LocalDate currentdate = LocalDate.of(2021, 8, 8);

        String dayName = currentdate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String day = String.format("%02d", currentdate.getDayOfMonth());
        String monthName = currentdate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int year = currentdate.getYear();

        System.out.println("********************************************");
        System.out.println("Today is " + dayName + ", " + day + ". " + monthName + " " + year + "!");
        System.out.println("Welcome to DLBCSOOPJ01!");
        System.out.println("********************************************");
    }
}