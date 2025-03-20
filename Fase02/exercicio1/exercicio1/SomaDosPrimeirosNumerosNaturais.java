package exercicio1;

public class SomaDosPrimeirosNumerosNaturais {
    public static void main(String[] args) {
        int n = 10;
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("A soma dos " + n + " primeiros números naturais é " + soma);
    }
}