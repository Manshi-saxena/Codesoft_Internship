import java.util.Random;
import java.util.Scanner;


public class Main {
    public static int gtrd() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("------welcome you in number game------");
        int num = gtrd();
        Scanner sc = new Scanner(System.in);
        System.out.println("you have only 10 attempts..");
        System.out.printf("guess number between 1 to 100 ");
        int ans = num;
        char game;

        do{

            for(int i=1;i<=10;i++) {
                int guess = sc.nextInt();
                if (guess == ans) {
                    System.out.println("you guess the number correctly...");
                    System.out.println("your score is:"+ i);
                    System.exit(0);
                } else if (guess < ans) {
                    System.out.println("too low..");
                } else if (guess > ans) {
                    System.out.println("too high.");

                }
            }
            System.out.println("sorry....your attempts are over....you loose...");
            System.out.print("wants to play again(y/n)");
            game=sc.next().charAt(0);
        } while(game =='y');



        System.exit(0);

    }
}