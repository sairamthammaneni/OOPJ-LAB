// Source code is decompiled from a .class file using FernFlower decompiler.
public class UserDefinedException {
   public UserDefinedException() {
   }

   public static void main(String[] var0) {
      byte var1 = 10;

      try {
         if (var1 < 18) {
            throw new AgeException("Age is below 18, not eligible to vote.");
         }

         System.out.println("Eligible to vote.");
      } catch (AgeException var3) {
         System.out.println("Exception caught: " + var3.getMessage());
      }

   }
}
