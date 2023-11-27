public class Data{
    private int data = 0;
    private int mes = 0;
    private int ano = 0;

    public void setData(int data){
        this.data = data;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getData(){
        return data;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public void inicializarData(int data, int mes, int ano){
        setData(data);
        setMes(mes);
        setAno(ano);
    }
    public void verificarData(){
        if(mes == 1){
            System.out.printf(" Janeiro ");
        }
        else if(mes == 2){
            System.out.printf(" Fevereiro ");
        }
        else if(mes == 3){
            System.out.printf(" Marco ");
        }
        else if(mes == 4){
            System.out.printf(" Abril ");
        }
        else if(mes == 5){
            System.out.printf(" Maio ");
        }
        else if(mes == 6){
            System.out.printf(" Junho ");
        }
        else if(mes == 7){
            System.out.printf(" Julho ");
        }
        else if(mes == 8){
            System.out.printf(" Agosto ");
        }
        else if(mes == 9){
            System.out.printf(" Setembro ");
        }
        else if(mes == 10){
            System.out.printf(" Outubro ");
        }
        else if(mes == 11){
            System.out.printf(" Novembro ");
        }
        else if(mes == 12){
            System.out.printf(" Dezembro ");
        }
        else{
            System.out.printf("Error: Mes invalido!");
        }

    }


    public void imprimirData(){
        System.out.println(getData() + "/" + getMes() + "/" + getAno());
    }
    public void imprimirDataExtenso(){
        if(getMes() > 12){
            verificarData();
        }
        else {
            System.out.printf(getData() + " de ");
            verificarData();
            System.out.printf(" de " + getAno());
        }

    }

}
