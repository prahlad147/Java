// Method 1

public class Main {

  public static void main(String[] args) {

    int count = 0, num = 0003452;

    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}

// Method 2

public class Main {

  public static void main(String[] args) {

    int count = 0, num = 123456;

    for (; num != 0; num /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);
  }
}