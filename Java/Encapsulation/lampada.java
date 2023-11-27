public class lampada {
    private String estado;
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    public void acender(){
        setEstado("Acesa");
    }
    public void apagar(){
        setEstado("Apagada");
    }
    public void mostrarEstado(){
        System.out.println("--------------------------");
        System.out.println("A lampada esta " + getEstado());

    }

}
