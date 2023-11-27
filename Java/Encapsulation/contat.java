import java.util.Calendar;
public class contat {
    private String name;
    private String email;
    private String telefone;
    private int Nascimento;
    Calendar calendar = Calendar.getInstance();
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setNascimento(int nascimento){
        this.Nascimento = nascimento;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getTelefone(){
        return telefone;
    }
    public int getNascimento(){
        return Nascimento;
    }


    public void inicializarContato(String name,String email, String telefone, int nascimento){
        setName(name);
        setEmail(email);
        setTelefone(telefone);
        setNascimento(nascimento);

    }
    public void imprimirContato(){
        System.out.println("--------------------------");
        System.out.println("Nome: " + getName());
        System.out.println("Email: " +  getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Nascimento: " + getNascimento());
        System.out.println("--------------------------");
    }
    public int calcularIdade(){
        return  calendar.get(Calendar.YEAR)- getNascimento();
    }


}
