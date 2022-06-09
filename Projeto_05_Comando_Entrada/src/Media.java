import java.util.Scanner; // Import necessario para utilizar a classe

public class Media {
    public static void main(String [] args) {
        // Intancia do objeto (buffer) utilizando a classe scanner
        Scanner entrada = new Scanner(System.in);
        // Declaração de variaveis
        String aluno;
        double nota1 , nota2 , media;
        System.out.println("Digite seu nome: ");
        aluno = entrada.nextLine(); // Recebe o nome do aluno

        System.out.println("Digite duas notas");
        nota1 = entrada.nextDouble(); // Recebe a primeira nota
        nota2 = entrada.nextDouble(); // Recebe a segunda nota

        media = ( nota1 + nota2 ) / 2; // Calcula as médias das notas

        System.out.println(aluno + " sua média é: " + media); // exibe a media

        entrada.close(); // encerra ainstancia
    } // fim do metodo main
} // fim da classe media