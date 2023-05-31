

import java.util.Scanner;

public class Booking
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
            boolean b = true;
            int num = 0;

            while (b) {
                System.out.println("*-*-*-* Ticket Booking *-*-*-*");
                System.out.println("1. Booking\t 2.Ticket History\t 3. Exit");
                try {
                    num = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("You Entered invalid input");
                   main(args);
                }
                switch (num) {
                    case 1: {
                        FunctionClass.booking();
                        break;
                    }
                    case 2:
                    {
                        FunctionClass.ticketHistory();
                        break;
                    }

                    case 3:
                    {
                        System.out.println("Thanks For Using This Application");
                        System.exit(0);
                    }
                }
            }
        }
    }

