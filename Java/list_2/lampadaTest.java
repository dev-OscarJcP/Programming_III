public class lampadaTest {
    public static void main(String[] args){
        lampada c1 = new lampada();
        c1.acende();
        c1.mostraEstado();

        c1.apaga();
        c1.mostraEstado();

        c1.meiaLuz(40);
        c1.mostraEstado();
        ;
        c1.apaga();
        if(c1.estaLigada() == false){
            System.out.printf("A luz esta apagada");
        }
    }
}
