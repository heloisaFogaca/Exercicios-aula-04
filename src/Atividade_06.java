public class Atividade_06 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);

        while (b <= 100) {
            int proximo = a + b;
            System.out.print(" " + proximo);
            a = b;
            b = proximo;
        }
    }
}
