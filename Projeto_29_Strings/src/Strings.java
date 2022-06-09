public class Strings {
    public static void main(String[] args) {
        String txt = "Ola Pessoal do IOS";
        String myStr1 = "Hello";
        String myStr2 = "Hello";

        char result = txt.charAt(0); // Caractere na posição zero              System.out.println("Char na posição zero: " + result);
        result = txt.charAt(10);     // Caractere na posição dez              System.out.println("Char na posição dez: " + result);

        System.out.println("Compara myStr1 com myStr2: " + myStr1.compareTo(mySt r2));
        System.out.println("Compara txt com myStr2: " + txt.compareTo(myStr2));
        System.out.println("Compara myStr1 com txt: " + myStr1.compareTo(txt));
        System.out.println("Verifica início da string txt: " + txt.startsWith("O la"));
        System.out.println("Verifica início da string txt: " + txt.startsWith("O "));
        System.out.println("Verifica início da string txt: " + txt.startsWith("o "));
        System.out.println("Verifica final da string txt: " + txt.endsWith("IOS" ));
        System.out.println("Verifica final da string txt: " + txt.endsWith("S")) ;
        System.out.println("Verifica final da string txt: " + txt.endsWith("s")) ;
    }
}
