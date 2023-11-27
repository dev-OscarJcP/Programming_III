import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    private static ResultSet resultSet;

    public static void main(String[] args) {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://127.0.0.1:3306/spar?serverTimezone=UTC&useSSL=false";

            String usuario = "root";
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao feita com sucesso!");
            
            Statement statement = conexao.createStatement();
            // Faça algo com a conexão, se necessário
            
            //consulta
            String cpf = "08070824573";
            String consultaSQL = "SELECT * FROM clientes WHERE cpf = " + cpf;
            resultSet = statement.executeQuery(consultaSQL);
            
            while(resultSet.next()){
                String nome = resultSet.getString("nome");
                System.out.println("nome: " + nome);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex);
        
        }
    }
}


