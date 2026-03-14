import java.util.Random;
import java.util.Scanner;
public class NumberGame{
  public static void main(String[] args){
    Random random=new Random();
    Scanner scanner=new Scanner(Sytstem.in);
    int number=random.nextInt(100)+1;
    int guess=0;
    System.out.println("Guess a number between 1 and 100");
    while(guess!=number){
      System.out.print("Enter your guess:");
      guess=scanner.nextInt();
      if(guess<number){
        System.out.println("Too low! Try again.");
      }
      else if(guess>number){
        System.out.println("Too high! try again.");
      }
      else{
        System.out.println("Correct! you guessed the number.");
      }
    }
    scanner.close();
  }
}
