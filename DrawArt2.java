public class DrawArt2 {
  public static void main(String[] args) {
    int limit = 5;
    for (int i = limit; i>=0;i--) {
      System.out.println("B");
      for(int j = i-1;j<limit;j++) {
        System.out.print("A");
      }
    }
    for (int i = 0; i<= limit+1;i++) {
      System.out.println("B");
      for(int j = limit -i;j>0;j--) {
        System.out.print("A");
      }
    }
  }
}
