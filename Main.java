/**
 *Odd digits are true even digits are false
 * @author Tolga Nurtekin
 */
public class Main {

  public static boolean allDigitsOdd(int integer){
    //create a loop to run as the integer is greater or less than 0
    while(integer > 0 || integer < 0){
      //make digit variable as a remainder 
      int digit = integer % 10;
      //divide the integer to find each digit
      integer /=10;

      //if digits are even return false
      if(digit % 2 == 0){
       return false;
      }
    
   } 
    return true; 
  }
   

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //delcare a variable for users final number
    boolean total = allDigitsOdd(3799);
    //tell user if true or false
    System.out.println(total);
    
  }
}
