// Method 1

class Main {
    
  public static void main(String[] args) {
    long num = 110110111;
    int decimal = convertBinaryToDecimal(num);
    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
}

// Method 2

class Main {

  public static void main(String[] args) {
    int num = 19;
    System.out.println("Decimal to Binary");
    long binary = convertDecimalToBinary(num);
    System.out.println("\n" + num + " = " + binary);
    }

  public static long convertDecimalToBinary(int n) {
    long binaryNumber = 0;
    int remainder, i = 1, step = 1;

    while (n!=0) {
      remainder = n % 2;
        System.out.println("Step " + step++ + ": " + n + "/2");
        System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
        n /= 2;
        binaryNumber += remainder * i;
        i *= 10;
    }
    
    return binaryNumber;
    }
}