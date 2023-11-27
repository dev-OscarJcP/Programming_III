import java.util.Scanner;

public class clientLampada {
    public static void limpaTerminal(){
        for(int i = 0;i < 40;i++){
            System.out.println();
        }
    }
    public static void main(String[] arg){
        lampada lamp1 = new lampada();
        Scanner scanf = new Scanner(System.in);
        while (true){

            System.out.println("--------------------------");
            System.out.printf("Deseja acender ou apagar a lampada? Para encerrar digite 0\n1 - acender\n2 - apagar\n3 - mostrar estado\nescolha: ");
            int escolha = scanf.nextInt();
            if(escolha == 1){
                lamp1.acender();
                limpaTerminal();
            }
            else if(escolha == 2){
                lamp1.apagar();
                limpaTerminal();
            }
            else if(escolha == 3){
                lamp1.mostrarEstado();
            }
            else{
                break;
            }

        }
    }
}
