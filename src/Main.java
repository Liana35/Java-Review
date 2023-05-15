import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = sc.nextLine();

        if (browser.equalsIgnoreCase("firefox") || browser.equals("FireFOX")) {
            System.out.println("Proceed with Chrome browser");
        }
    }
    }