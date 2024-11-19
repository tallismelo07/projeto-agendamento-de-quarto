import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de quartos alugados: ");

        int quartosParaAlugar = sc.nextInt();
        Cliente[] vect = new Cliente[10];

        for (int i = 1; i < quartosParaAlugar ; i++) {
            System.out.println();
            System.out.println("Detalhes dos Aluguéis: ");
            System.out.println("Quarto " + i);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Cliente(nome, email);
        }

        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}