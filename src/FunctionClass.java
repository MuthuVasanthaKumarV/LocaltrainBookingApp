
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FunctionClass
{
    static  List<String> tickets = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
   static int ticketCounter=0;

    public static void booking()
    {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter ld1 = DateTimeFormatter.ofPattern("E dd-MMM-yyyy HH:mm:ss");
        String d1= ldt.format(ld1);
          Set l1 = new HashSet();
        l1.add("tambaram");l1.add("tambaramsantorium");l1.add("chrompet");l1.add("pallavaram");l1.add("palavanthangal");
        l1.add("thirusulam"); l1.add("meenambakam"); l1.add("st.thomas mount");l1.add("guindy"); l1.add("saidapet");
        System.out.println(l1);
        System.out.println("Enter From location : ");
        String from = sc.next().toLowerCase();
        sc.nextLine();
        System.out.println("Enter To location : ");
        String to = sc.next().toLowerCase();
        sc.nextLine();
        System.out.println("Enter the No.of Passenger : ");
        int pass=0;
        try
        {
           pass = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            booking();
        }
        String concat = from + to;
       if(l1.contains(from) && l1.contains(to)) {
           if (concat.equals("tambaramsaidapet") || concat.equals("saidapettambaram") || concat.equals("tambaramguindy") || concat.equals("guindytambaram") || concat.equals("tambaramst.thomas mount") || concat.equals("st.thomas mounttambaram")
                   || concat.equals("tambarampalavanthangal") || concat.equals("palavantangaltambaram") || concat.equals("tambarammeenambakam") || concat.equals("meenambakamtambaram") || concat.equals("tambaramsantoriumguindy") || concat.equals("guindytambaramsantorium")
                   || concat.equals("saidapettambaramsantorium") || concat.equals("tambaramsantoriumsaidapet") || concat.equals("tambaramsantoriumpalavantangal") || concat.equals("palavantangaltambaramsantorium") || concat.equals("tambaramsantoriumst.thomas mount") || concat.equals("st.thomas mounttambaramsantorium") || concat.equals("chrompetsaidapet") || concat.equals("saidapetchrompet") || concat.equals("chrompetguindy") || concat.equals("guindychrompet") || concat.equals("chrompetst.thomas mount") || concat.equals("st.thomas mountchrompet") || concat.equals("pallavaramsaidapet") || concat.equals("saidapetpallavaram") || concat.equals("pallavaramguindy")
                   || concat.equals("guindypallavaram") || concat.equals("tirusulamsaidapet") || concat.equals("saidapettirusulam")) {
               System.out.println("Date And Time : " + d1);
               System.out.println("From : " + from);
               System.out.println("To : " + to);
               System.out.println("No. of Passengers : " + pass);
               double price1 = pass * 10;
               System.out.println("Amount : " + price1);
               ticketCounter++;
               String ticketInfo = String.format("Ticket number: %d Date: %s From: %s To: %s Passengers: %s Amount: %f", ticketCounter, d1, from, to, pass, price1);
               tickets.add(ticketInfo);
           } else {
               System.out.println("Date And Time : " + d1);
               System.out.println("From : " + from);
               System.out.println("To : " + to);
               System.out.println("No.of Passengers : " + pass);
               double price = pass * 5;
               System.out.println("Amount : " + price);
               ticketCounter++;
               String ticketInfo = String.format("Ticket number: %d Date: %s From: %s To: %s Passengers: %s Amount: %f", ticketCounter, d1, from, to, pass, price);
               tickets.add(ticketInfo);
           }
       }
        else {
            System.out.println("You Entered invalid input");
            booking();
        }

    }
       public static void ticketHistory()
       {
        for (String ticket : tickets) {
            System.out.println(ticket);
        }

    }

}
