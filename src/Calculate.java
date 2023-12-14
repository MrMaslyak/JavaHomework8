  class Calculate {
      public int add(int a, int b) {
          return a + b;
      }

      public int subtract(int a, int b) {
          return a - b;
      }

      public int multiply(int a, int b) {
          return a * b;
      }

      public double divide(double a, double b) {
          if (b == 0) {
              System.out.println("Нельзя делить на ноль!");
          }
          return a / b;
      }
  }
