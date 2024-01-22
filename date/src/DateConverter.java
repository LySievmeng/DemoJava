import java.util.Scanner;

public class DateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date in the format YYYY-MM-DD: ");
        String shortDate = scanner.nextLine();

        String[] dateParts = shortDate.split("-");
        String year = dateParts[0];
        String month = dateParts[1];
        String day = dateParts[2];

        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int monthNumber = Integer.parseInt(month);
        String monthName = "";

        for (int i = 1; i <= 12; i++) {
            if (i == monthNumber) {
                monthName = months[i];
                break;
            }
        }

        if (monthName.equals("")) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        } else {
            String fullDate = monthName + " " + day + ", " + year;
            System.out.println("The full date representation is: " + fullDate);
        }
    }
}
