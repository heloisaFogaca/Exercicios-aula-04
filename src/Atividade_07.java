import java.util.Scanner;

public class Atividade_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro para x: ");
        int x = scanner.nextInt();

        System.out.print("Sequência: " + x);

        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.print(" -> " + x);
        }

        scanner.close();
    }
}
