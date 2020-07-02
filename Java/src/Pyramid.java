
public class Pyramid {

 public static void pyramid(int n) {
  for (int i = 1; i <= n; i++) {
   for (int j = 0; j < i; j++) {
    System.out.print("*");
   }

   System.out.println("");
  }

 }

 public static void main(String[] args) {
  int n = 6;
  pyramid(n);

 }
}
