import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class A24 {
    public static void main(String[] args) {
        Queue<Coin> coins = new PriorityQueue<>();

        Scanner keyboard = new Scanner(System.in);
        int denomination;
        boolean status = true;

        while (status) {
            System.out.print("Input coin denominations one at time" +
                    " or enter 0 when finished: ");
            denomination = keyboard.nextInt();

            if (denomination == 0) {
                status = false;
                continue;
            } else {
                coins.add(new Coin(denomination));
            }
        }

        System.out.print("Input change needed: ");

    }}

