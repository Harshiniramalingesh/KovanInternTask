
class DiamondPattern {
     public static void main(String[] args) {
   int n = 5;
   for (int i = 0; i <= n / 2; i++) {
       for (int j = 0; j < (n / 2) - i; j++) {
           System.out.print(" ");
       }
       for (int k = 0; k < (2 * i + 1); k++) {
           System.out.print("*");
       }
       System.out.println();
   }

   for (int i = n / 2 - 1; i >= 0; i--) {
       for (int j = 0; j < (n / 2) - i; j++) {
           System.out.print(" ");
       }
       for (int k = 0; k < (2 * i + 1); k++) {
           System.out.print("*");
       }
       System.out.println();
   }
}
}
