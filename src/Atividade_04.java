public class Atividade_04 {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + n + " é: " + fatorial);
        }
    }
}
