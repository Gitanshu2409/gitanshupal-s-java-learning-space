public class JavaMath {
// Using Java Math Function to perform logical mathematical operations.
   
   public static void main(String[]args) {
      int inta = 6;
      int intb = 9;
      int intc = -7;
      double intr = Math.random();
      
      
      // Math.max() function specifies which integer has the highest value amongst the two given intergers.
      System.out.println("Bigger number among 6 and 9 is : " + Math.max(inta, intb));
      
      
      // Math.min() function specifies which integer has the lowest value amongst the two given integers.
      System.out.println("Smaller number among 6 and 9 is : " + Math.min(inta, intb));
      
      
      // Math.sqrt() function returns the square root of the given integer.
      System.out.println("Square Root of 6 : " + Math.sqrt(inta));
      System.out.println("Square Root of 9 : " + Math.sqrt(intb));
      System.out.println("Square Root of (-7)  : " + Math.sqrt(intc));
      
      
      /* Math.abs() function returns the positive exact value of the specified integer whether the integer is 
      already positive or negative.*/
      System.out.println("Positive exact value of (-7) : " + Math.abs(intc));
      
      
      // Maths.random() returns any random number between 0 to 1 everytime.
      System.out.println("A random number between 0 to 1 : " + intr);
      
      // Got It.
      
      }
}
      