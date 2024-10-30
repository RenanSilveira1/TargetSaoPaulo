import java.util.Scanner;

public class InversaoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string para inverter: ");
        String original = scanner.nextLine();
        
        String stringInvertida = "";
        for (int i = 0; i < original.length(); i++) {
            stringInvertida = original.charAt(i) + stringInvertida;
        }

        System.out.println("String invertida: " + stringInvertida);
        
        scanner.close();
    }
}
