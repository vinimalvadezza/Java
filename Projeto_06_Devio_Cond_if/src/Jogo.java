import java.util.Scanner; // import nescessario pasra utilizar a classe

public class Jogo {
    public static void main (String [] args) {
        // instancia do objeto (buffer) utilizando a classe scanner
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Digite o número de pontos do jogador: ");
        pontos = entrada.nextInt();  // Recebe o numeros d epontos

        if (pontos >= 1000) {
            System.out.println("Você passou para a faze 2!!!");
        }

        System.out.println("proxima instrução");
        entrada.close();
    } // fimk do metodo main
} // fim da classe jogo
