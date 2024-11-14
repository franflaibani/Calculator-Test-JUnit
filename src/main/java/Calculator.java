public class Calculator {

    public int addition(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            return 0; //Returns 0 if x is divided by zero.
        }
        return x / y;
    }

    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    //NOTE: This method returns the square root with NO DECIMALS, only the integer part.
    public int squareRoot(int number) {
        if (number < 0) {
            return 0; //Returns 0 if number negative.
        }
        int root = 0;
        while (root * root <= number) {
            root++;
        }
        return root - 1; //Couldn't find the square root.
    }

    public int modulus(int x, int y) {
        return x % y;
    }

    public boolean greaterThan(int x, int y) {
        return x > y;
    }

    public boolean smallerThan(int x, int y) {
        return x < y;
    }

    public boolean equals(int x, int y) {
        return x == y;
    }

    public int absolute(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public boolean isPair(int x) {
        return x % 2 == 0;
    }

    public boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
