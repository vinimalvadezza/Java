import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char resp;
        String nome;
        int idade;
        resp = 's';

        while (resp == 's') {
            System.out.println("digite o seu nome:");
            nome = entrada.next();
            System.out.println("Digite sua idade:");
            idade = entrada.nextInt();
            if (idade >= 18) {
                System.out.println("Seu nome eh: " + nome);
            }

            System.out.println("Deseja continuar ? (s/n):");
            resp = entrada.next().charAt(0);
        }
        entrada.close();
    }

}
