import java.util.Scanner;

public class clientData {
    public static void main(String[] args) {
        Data data1 = new Data();
        Scanner scanf = new Scanner(System.in);
        System.out.printf("Nome: ");
        String nome = scanf.nextLine();
        System.out.println("--------------------------");
        System.out.println("Seja bem vindo " + nome);
        System.out.println("--------------------------");
        System.out.println("Informe: ");
        System.out.printf("Dia: ");
        int dia = scanf.nextInt();
        System.out.printf("Mes: ");
        int mes = scanf.nextInt();
        System.out.printf("Ano: ");
        int ano = scanf.nextInt();
        System.out.println("--------------------------");
        data1.inicializarData(dia, mes, ano);
        data1.imprimirData();
        data1.imprimirDataExtenso();


    }
}