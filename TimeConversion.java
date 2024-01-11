import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time (hh:mm:ss AM/PM): ");
        String inputTime = scanner.nextLine();

        String outputTime = convertTo24Hour(inputTime);
        System.out.println("Time in 24-hour format: " + outputTime);

        scanner.close();
    }

    private static String convertTo24Hour(String inputTime) {
        // Extract components of the input time
        int hours = Integer.parseInt(inputTime.substring(0, 2));
        int minutes = Integer.parseInt(inputTime.substring(3, 5));
        int seconds = Integer.parseInt(inputTime.substring(6, 8));
        String suffix = inputTime.substring(9);

        if (suffix.equals("PM") && hours != 12) {
            hours += 12;
        } else if (suffix.equals("AM") && hours == 12) {
            hours = 0;
        }
        return (hours + ":" + minutes + ":" + seconds);
    }
}
