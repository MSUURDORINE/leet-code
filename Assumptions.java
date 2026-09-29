public class Assumptions {
  public static void main(String... args) {
  
    int one = 2;
    int two = 3;
    int three = 2;
    int four = 2;
    
    System.out.println(one == 2);
    System.out.println(two == 5);
    System.out.println((one >= 2) && (two <= 3));
    System.out.println((four <= 100) & (three <= four));
    System.out.println((two >= one) || (three != four));
    System.out.println((three + one < two) | (4 - two >= three));
    System.out.println(!(three > two));
    }
    }
