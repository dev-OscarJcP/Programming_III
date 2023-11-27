import java.util.Scanner;

public class clientContat {
    public static void main(String[] args){
        contat pessoa1 = new contat();
        Scanner scanf = new Scanner(System.in);
        System.out.printf("Nome: ");
        String nome = scanf.nextLine();
        System.out.printf("Email: ");
        String email = scanf.nextLine();
        System.out.printf("Telefone: ");
        String telefone = scanf.nextLine();
        System.out.printf("Nascimento: ");
        int ano = scanf.nextInt();

        pessoa1.inicializarContato(nome, email, telefone, ano);

        pessoa1.imprimirContato();

        System.out.println("Idade: " + pessoa1.calcularIdade());

    }
}
