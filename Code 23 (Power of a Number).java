// Method 1

public class Power {

    public static void main(String[] args) {

        int base = 3, exponent = 4;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}

// Method 2

public class Power {

    public static void main(String[] args) {

        int base = 3, exponent = 4;

        long result = 1;

        for (;exponent != 0; --exponent)
        {
            result *= base;
        }

        System.out.println("Answer = " + result);
    }
}

// Method 3

public class Power {

    public static void main(String[] args) {

        int base = 3, exponent = -4;
        double result = Math.pow(base, exponent);

        System.out.println("Answer = " + result);
    }
}