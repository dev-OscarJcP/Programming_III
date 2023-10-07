import java.util.Random;
import java.util.Scanner;


public class craps {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanf = new Scanner(System.in);

        int dado1, dado2;

        System.out.println("------------------------------");
        System.out.println("\t\tJogo Craps");
        System.out.println("------------------------------");
        System.out.print("Jogador 1: ");
        String jogador1 = scanf.nextLine();

        System.out.println("------------------------------");
        System.out.printf("Aperte a tecla ENTER para girar os dados");
        String enter = scanf.nextLine();
        System.out.println("------------------------------");
        dado1 = random.nextInt(6);
        dado2 = random.nextInt(6);
        System.out.println("Jogada Inicial");
        System.out.printf("dado 1: %d    dado 2: %d\n", dado1, dado2);
        System.out.printf("Ponto: %d\n", dado1 + dado2);

        if (dado1 + dado2 == 7 || dado2 + dado1 == 11) {
            System.out.println("------------------------------");
            System.out.printf("Parabens %s! Voce ganhou!\n", jogador1);
            System.out.println("------------------------------");
            System.exit(0);
        }
        else if (dado1 + dado2 == 2 || dado1 + dado2 == 3 || dado1 + dado2 == 12) {
            System.out.println("------------------------------");
            System.out.println("\t\tGAMER OVER");
            System.out.println("------------------------------");
            scanf.close();
            System.exit(0);
        }
        for (int i = 0;i < 4;i++){
            if(i == 0){
                System.out.println("------------------------------");
                System.out.println("\t\tEstagio 2");
            }
            System.out.println("------------------------------");
            System.out.printf("Aperte a tecla ENTER para girar os dados");
            enter = scanf.nextLine();
            System.out.println("------------------------------");
            dado1 = random.nextInt(6);
            dado2 = random.nextInt(6);
            System.out.printf("Jogada %d\n", i + 1);
            System.out.printf("dado 1: %d    dado 2: %d\n", dado1, dado2);
            System.out.printf("Ponto: %d\n", dado1 + dado2);

            if(dado1 + dado2 == 7){
                System.out.println("------------------------------");
                System.out.println("\t\tGAMER OVER");
                System.out.println("------------------------------");
                scanf.close();
                System.exit(0);
            }
        }
        System.out.println("------------------------------");
        System.out.printf("Parabens %s! Voce ganhou!\n", jogador1);
        System.out.println("------------------------------");
        scanf.close();

        }
    }
