package a2;

import java.util.Scanner;

public class InputForMonthsAndDays {
    public static void main(String[] args) {
        System.out.println("Please enter a number no greater than the number of months in the year");

        int month = new Scanner(System.in).nextInt();

        switch (month) {

            case 1: {
                System.out.println("January");
                if (month == 1) {
                    System.out.println("Please select day");
                    int day = new Scanner(System.in).nextInt();
                    if (day != 0 && day < 32) {
                        System.out.println("That's correct, also there are " + day + " days in January");
                    } else System.out.println("Please choose right number");
                }
                break;
            }
            case 2:
                System.out.println("February");
                System.out.println("Please select day");
                int day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 30)
                    System.out.println("That's correct, also there are " + day + " days in February");
                else System.out.println("Please choose right number");
                break;
            case 3:
                System.out.println("March");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 32)
                    System.out.println("That's correct, also there are " + day + " days in March");
                else System.out.println("Please choose right number");
                break;
            case 4:
                System.out.println("April");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 31)
                    System.out.println("That's correct, also there are " + day + " days in April");
                else
                    System.out.println("Please choose right number");
                break;
            case 5:
                System.out.println("May");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 32) System.out.println("That's correct, also there are " + day + " days in May");
                else
                    System.out.println("Please choose right number");
                break;
            case 6:
                System.out.println("June");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 31) System.out.println("That's correct, also there are " + day + " days in June");
                else
                    System.out.println("Please choose right number");
                break;
            case 7:
                System.out.println("July");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 32) System.out.println("That's correct, also there are " + day + " days in July");
                else
                    System.out.println("Please choose right number");
                break;
            case 8:
                System.out.println("August");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 32)
                    System.out.println("That's correct, also there are " + day + " days in August");
                else
                    System.out.println("Please choose right number");
                break;
            case 9:
                System.out.println("September");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 31)
                    System.out.println("That's correct, also there are " + day + " days in September");
                else
                    System.out.println("Please choose right number");
                break;
            case 10:
                System.out.println("October");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 32)
                    System.out.println("That's correct, also there are " + day + " days in October");
                else
                    System.out.println("Please choose right number");
                break;
            case 11:
                System.out.println("November");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 31)
                    System.out.println("That's correct, also there are " + day + " days in November");
                else
                    System.out.println("Please choose right number");
                break;
            case 12:
                System.out.println("December");
                System.out.println("Please select day");
                day = new Scanner(System.in).nextInt();
                if (day != 0 && day < 32)
                    System.out.println("That's correct, also there are " + day + " days in November");
                else
                    System.out.println("Please choose right number");
            default:
                System.out.println("Number is wrong");
        }
    }
}
