import java.lang.Object;
import java.util.Scanner;
import java.lang.Math;
public class NoDice {
 public static void main(String args[]){
 //Modulus Number
  int[] list = rollDice().clone();
  int x = 0;
   for(int k = 0; k < 6; k++){
   x = list[k]+ x;
   }
   int y = x%2;
   //Finding Number of players
   System.out.println("Enter Number of Players Please");
   Scanner s = new Scanner(System.in);
   while (!s.hasNextInt()) s.next();
   int players = s.nextInt();
   String[] Names = new String[players];
   boolean[] trueFalse = new boolean[players];
   //Adding data to array
   for (int q = 0; q < players; q++){
     Names[q] = NameCollector();
     trueFalse[q] = pickupBets();
   }
   //Deciding right from wrong
   for (int u = 0; u < players; u++){
     if (y == 0){
       if (trueFalse[u] == false){
         System.out.println(Names[u] + " Bingo!");
       }
       else {
         System.out.println(Names[u] + " Wrong...");
       }
     }
     if (y == 1){
       if (trueFalse[u] == true){
         System.out.println(Names[u] + " Bingo!");
       }
       else {
         System.out.println(Names[u] + " Wrong...");
       }
     }
   }
   System.out.println("The Number was... " + x);
 }
 //Finding 6 numbers(6 dice)
 public static int[] rollDice(){
 int list[];
 list = new int[6];
 for(int k = 0; k < 6; k++){
   int x = (int)(Math.random()*6)+1;
   list[k] = x;
   }
   return list;
}
//Picking up answers
 public static boolean pickupBets(){
 System.out.println("Enter Next Bet");
 Scanner sc = new Scanner(System.in);
 boolean bn = sc.nextBoolean();
 return bn; 
}
//Collecting names of players
  public static String NameCollector(){
    System.out.println("Enter Name here");
    Scanner n = new Scanner(System.in);
    String s = n.nextLine();
    return s;
    }
  }

