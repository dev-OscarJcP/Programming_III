public class lampada
{
    int estadoDaLampada;

    void acende(){
        estadoDaLampada = 100;
    }
    void apaga(){
         estadoDaLampada = 0;
    }
    void meiaLuz(int porcentagem){
        estadoDaLampada = porcentagem;
    }

    boolean estaLigada(){
        if(estadoDaLampada > 0){
            return true;
        }
        else {
            return false;
        }
    }

    void mostraEstado(){
        if(estadoDaLampada == 0){
            System.out.println("-------------------");
            System.out.println("Luz apagada!");
            System.out.println("-------------------");
        }
        else if(estadoDaLampada == 100){
            System.out.println("-------------------");
            System.out.println("Luz totalmente acesa!");
            System.out.println("-------------------");
        }
        else if(estadoDaLampada > 0 && estadoDaLampada < 100){
            System.out.println("-------------------");
            System.out.printf("Luz com %d de forca!\n",estadoDaLampada);
            System.out.println("-------------------");
        }
    }
}
