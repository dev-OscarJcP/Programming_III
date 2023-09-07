import java.util.Scanner;


public class battleship {
    static void adicionar_coordenada(int[][] matriz, String jogador) {
        Scanner scanf = new Scanner(System.in);

        System.out.printf("Player %s, Enter your ships' coordinates \n", jogador);
        System.out.println("----------------------------");
        int cont = 0, linha, coluna;
        while (cont != 5) {
            System.out.printf("Enter ship %d location: \n", cont + 1);
            linha = scanf.nextInt();
            coluna = scanf.nextInt();
            if (linha >= 5 || coluna >= 5) { // condicao de erros
                System.out.printf("Invalid coordinates. Choose different coordinates.\n");
                continue;
            }
            if (matriz[linha][coluna] == 1) {
                System.out.println("You already have a ship there. Choose differente coordinates");
                continue;
            }
            matriz[linha][coluna] = 1;
            cont++;
        }
    }

    static void mostrar_mapa(int[][] matriz){
        int m;
        for(m = 0;m < 5;m++){ //coordenada de cima
            System.out.printf("\t%d ",m);
            if(m == 4){
                System.out.println();
            }
        }
        for(int i = 0;i < 5;i++){   // coordenada dos barcos
            System.out.printf("%d\t", i);
            for(int j = 0;j < 5;j++){
                if(matriz[i][j] == 0){
                    System.out.printf("-\t");
                }
                else if(matriz[i][j] == 1){
                    System.out.printf("@\t");
                }
                else if(matriz[i][j] == 2){
                    System.out.printf("X\t");
                }
                else if(matriz[i][j] == 3){
                    System.out.printf("O\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    static int verificacao_mapa(int[][] matriz) {
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == 2) {
                    cont++;
                }
            }
        }
        if (cont == 5) {
            return 1;
        }
        return 0;
    }

    static void missed(int[][] mapa,int[][] navio, String jogador1, String jogador2) {
        Scanner scanf = new Scanner(System.in);

        int cont = 0;
        int linha = 0, coluna = 0;

        while (cont == 0) {
            System.out.println("----------------------------");
            System.out.printf("Player %s, Enter hit row/column: \n", jogador1);
            linha = scanf.nextInt();
            coluna = scanf.nextInt();

            if (linha >= 5 || coluna >= 5) { // condicao de erros
                System.out.printf("Invalid coordinates. Choose different coordinates.\n");
                continue;
            }
            if (mapa[linha][coluna] == 2 || mapa[linha][coluna] == 3) {
                System.out.println("You already fired on this spot. Choose differente coordinates");
                continue;
            }
            break;
        }
        System.out.println("----------------------------");
        System.out.printf("\tPlayer %s MISSED!\n", jogador1);
        System.out.println("----------------------------");

        if(navio[linha][coluna] == 0){
            mapa[linha][coluna] = 3;
        }
        else if(navio[linha][coluna] == 1){
            mapa[linha][coluna] = 2;
            System.out.printf("Player %s hit Player %s's Ship!\n", jogador1, jogador2);
        }

        mostrar_mapa(mapa);

    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("\tWelcome Battleship!");
        System.out.println("----------------------------");
        System.out.print("Player 1 = ");
        String jogador1 = scanf.nextLine();
        System.out.print("Player 2 = ");
        String jogador2 = scanf.nextLine();
        System.out.println("----------------------------");

        //Escolha de localizacao dos barcos
        int[][] p_ship1 = new int[5][5];
        int[][] p_ship2 = new int[5][5];


        int[][] mapa_p1 = new int[5][5];
        int[][] mapa_p2 = new int[5][5];
        for(int x = 0; x < 5;x++){ //
            for(int z = 0;z < 5;z++){
                mapa_p1[x][z] = 0;
                mapa_p2[x][z] = 0;
            }
        }
        // adicionar navios
        adicionar_coordenada(p_ship1, jogador1);
        mostrar_mapa(p_ship1);
        adicionar_coordenada(p_ship2, jogador2);
        mostrar_mapa(p_ship2);

        //comecar jogada
        int jog = 0, contad = 0; //jog = verificacao, contad = decidir quem vai jogar
        while(jog == 0){
            if(contad % 2 == 0){
                missed(mapa_p1, p_ship2, jogador1, jogador2);
                if(verificacao_mapa(mapa_p1) == 1){
                    System.out.println("----------------------------");
                    System.out.printf("\tPlayer %s WIN!\n", jogador1);
                    System.out.println("----------------------------");
                    break;
                }
            }
            if(contad % 2 == 1){
                missed(mapa_p2,p_ship1,jogador2, jogador1);
                if(verificacao_mapa(mapa_p2) == 1){
                    System.out.println("----------------------------");
                    System.out.printf("\tPlayer %s WIN!\n", jogador2);
                    System.out.println("----------------------------");
                    break;
                }
            }
            contad++;
        }

        scanf.close();
    }
}


