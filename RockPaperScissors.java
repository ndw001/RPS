/** 
 * Class RockPaperScissors.  Plays repeated games of Rock Paper Scissors with a user 
 * @author Your Name
 * @date The date
 * */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
  public static String choiceAsString(int choice){
    if(choice==0){
      return "rock";
    }else if(choice==1){
      return "paper";
    }else if(choice==2){
      return "scissors";
    }else{
      return "";
    }
  }

  public static void saveResults(String input){
    
    userMoves[turn] = input;
    turn+=1;
  }
  public static void main( String[] args ){
    int initialCapacity = 5;
    // Store the user's move history
    String[] userMoves = new String[initialCapacity];  
    // Store the System's move history
    LinkedList<String> systemMoves = new LinkedList<String>();  
    int turn =0;
    String input = "";
    System.out.println("Let's play!  What's your move? (r=rock, p=paper, s=scissors or q to quit)");
    while(input!="q"){
      System.out.println("Let's play!  What's your move? (r=rock, p=paper, s=scissors or q to quit)");
      Scanner sc = new Scanner(System.in);
      input = sc.nextLine();
      Random rand = new Random();
      int choice = rand.nextInt(3);
      //1=r 2=p 3=s
      if(input=="r"){
          if(choice==1){
              System.out.println("I choose rock. We tied!");
          } else if(choice==2){
              System.out.println("I choose paper. I win!");
          } else if(choice==3){
              System.out.println("I choose scissors. You win.");
          }
      }else if(input=="s"){
          if(choice==1){
              System.out.println("I choose rock. I win!");
          } else if(choice==2){
              System.out.println("I choose paper. You win.");
          } else if(choice==3){
              System.out.println("I choose scissors. We tied!");
          }
      }else if(input=="p"){
          if(choice==1){
              System.out.println("I choose rock. You win.");
          } else if(choice==2){
              System.out.println("I choose paper. We tied.");
          } else if(choice==3){
              System.out.println("I choose scissors. I win!");
          }
      }else{ 
          System.out.println("That is an invalid move. Please try again.");
      }


    }
    System.out.println("Thanks for playing!");
    System.out.println("Our most recent games were: ");
  }
}