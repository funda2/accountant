    import java.util.*;

    public class accountant {
        public static void main(String[] args) {

            //Entrada de datos del usuario
            System.out.print("\nContar hasta: ");

            Scanner scanner_input = new Scanner(System.in);
            int countup = scanner_input.nextInt();

            int intvar = 1;

            while(intvar <= countup) {
                System.out.print(intvar);
                if(countup != intvar) {
                    System.out.print(", ");
                } else {
                    //Nada
                }
                intvar++;
            }

            System.out.println("\nCuenta finalizada");

        }
    }
