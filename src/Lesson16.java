import java.util.Scanner;

public class Lesson16 {
    public static void main(String args[]){
        int secret = 15;
        if(args[0].equalsIgnoreCase("v2")){
            secret = 25;
        }
        System.out.println("Guess a number between 1 and 100: ");
        int guess = 0;
        Scanner input = new Scanner(System.in);
        do{
            guess = input.nextInt();
            if(guess < secret){
                System.out.println("Your number is too low, try again: ");
            }
            if(guess > secret){
                System.out.println("Your number is too high, try again: ");
            }
        }while(guess != secret);
        System.out.println("Congrats, you have guessed the secret number, it was: " + secret);
    }
}
