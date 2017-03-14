/**
 * Created by Serg on 09.03.2017.
 */
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class FriendsAndFamily {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n Enter list price: ");
            double listPrice = input.nextDouble();

            System.out.println(" Enter discount %: ");
            int discount = input.nextInt();

            System.out.printf(" You'll pay only $%2.2f", listPrice - listPrice * discount / 100);

        } while (true);

    }
}
