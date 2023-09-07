import java.util.Scanner;
import java.lang.Math;

public class Multimetro {

    public static void main(String[] args){
        double media = 0, media2;
        double variancia = 0,desvio;
        double[] vetor = {3.2, 4.8, 2.5, 6.1, 3.9, 5.6, 2.2, 4.3, 6.8, 3.7};
        double[] dif = new double[10];
        for(int i = 0;i < 10;i++){
            media += vetor[i];
        }
        media /= 10;

        for(int i = 0;i < 10;i++){
            dif[i] = vetor[i] - media;
            dif[i] *= dif[i];
            variancia += dif[i];
        }
        variancia /= 10;
        desvio = Math.sqrt(variancia);
        if(desvio > media){
            media2 = (media / 100) * 10;
            double aux = desvio - media;
            if(aux >= media2) {
                System.out.println("Esse multimetro esta com problemas!");
                System.exit(0);
            }
        }
        System.out.printf("Desvio: %f\n", desvio);
        System.out.printf("Variancia: %f\n", variancia);
        System.out.printf("Media: %f\n", media);


    }
}
