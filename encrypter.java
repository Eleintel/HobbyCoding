import java.util.Scanner;
import java.util.Arrays;
public class encrypter{
  public static void main(String args[]){
    String original = getOriginal();
    String[] splitString = split(original);
    char[] x = splitChar(splitString);
    int[] code = encode(x);
    String[] finished = returned(code);
    for(int u = 0; u < finished.length; u++){
    System.out.println(finished[u]);
    }
  }

public static String getOriginal(){
  System.out.print("Enter message here -->");
  Scanner sc = new Scanner(System.in);
  String message = sc.nextLine();
  return message;
}
  public static String[] split(String s){
    String[] splitStrings = s.split(" ");
    return splitStrings;
  }
  public static char[] splitChar(String[] s){
    char[][] a1 = new char[s.length][];
    for (int i = 0; i < s.length; i++){
      a1[i] = s[i].toCharArray();
    }
    int total = 0;
    for(int i =0;i<s.length;i++){
 		total = total + a1[i].length;
    }
    char[] allchar = new char[total];
    int counter = 0;
    for (int i = 0; i < a1.length; i++){
      for (int j = 0; j < a1[i].length; j++){
        allchar[counter++] = a1[i][j];
      }
    }
    return allchar;
  }
  public static int[] encode(char[] c){
    int[] coded = new int[c.length];
    int key = c.length;
    for(int i = 0; i < c.length; i++){
      int p = (int)c[i];
      coded[i] = p*key;
      key -= 1;
    }
    return coded;
  }
   public static String[] returned(int[] x){
   String[] kappa = new String[x.length];
   for(int i = 0; i < x.length; i++){
   kappa[i] = String.valueOf(x[i]);
   }
   return kappa;
  }

}