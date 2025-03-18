/**
 * Este programa calcula os fatoriais dos números de 1 a 40.
 * Caso o resultado do fatorial ultrapasse o limite máximo permitido pelo tipo long,
 * é exibida uma mensagem informando sobre o overflow.
 * O tipo long suporta valores até 9.223.372.036.854.775.807 (Long.MAX_VALUE).
 */

public class Atividade_05 {
    public static void main(String[] args) {
        for (int n = 1; n <= 40; n++) {
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                if (Long.MAX_VALUE / i < fatorial) {
                    System.out.println("Fatorial de " + n + " ultrapassa o limite do tipo long.");
                    break;
                }
                fatorial *= i;
            }
            if (fatorial > 0) {
                System.out.println("Fatorial de " + n + " é: " + fatorial);
            }
        }
    }
}
