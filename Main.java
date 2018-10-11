import java.util.*;
/*
 * I'm creating a crack the code program.
 */
public class Main
{
 public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    //Ask for Users name and welcomes them to the program
    System.out.println("Welcome. What is your name?");
    String name = kin.nextLine();
    System.out.println("Hello " + name +". " + "Try your best to crack the code!");
    
    //Enter Phase 1, number has to be 3 to procede to phase 2
    System.out.println("\nPHASE 1");
    System.out.println("Enter a number:");
    int phase1Number = kin.nextInt();
    
    if(phase1Number == 3){
     System.out.println("Correct!");
     System.out.println("\nPHASE 2");
     System.out.println("Enter a number:");
     
     int phase2Number = kin.nextInt(); //Enter Phase 2, number has to be between 33 and 100 inclusive
     if(phase2Number == 1 || phase2Number >= 33 && phase2Number <= 100){
        System.out.println("Correct!");
        System.out.println("\nPHASE 3");
        System.out.println("Enter a number:");
        
        int phase3Number = kin.nextInt(); //Enter Phase 3, number has to be either divisible by 3 or 7
        int phase3NumberRemainderby3 = phase3Number % 3;//Checks if number is divisible by 3
        int phase3NumberRemainderby7 = phase3Number % 7;//Checks if number is divisible by 7 
        if(phase3Number > 1 && (phase3NumberRemainderby3 == 0 || phase3NumberRemainderby7 == 0)){ 
         System.out.println("Correct!");
         System.out.println("You have cracked the code!");
        }
        else if(phase3Number<= 0 || phase3NumberRemainderby3!=0 || phase3NumberRemainderby7!=0){
         System.out.println("Sorry, that was incorrect!");
         System.out.println("Better luck next time!");
        }
        }
     else if(phase2Number!=1||phase2Number<33 && phase2Number>100){
      System.out.println("Sorry, that was incorrect!");
      System.out.println("Better luck next time!");
        }
    }
    else if(phase1Number!=3){
     System.out.println("Sorry, that was incorrect!");
     System.out.println("Better luck next time!");
    }
    }
}
