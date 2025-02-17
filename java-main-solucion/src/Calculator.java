public class Calculator {


        public int add ( int a, int b){
            return a + b;
        }

        public int divide ( int a, int b) {
            int c = 0;
            try {
                c = a / b;
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero.");
            }
            return c;
        }
  }

