/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class Administrador {
    private String usuario;
    private String senha;
    
    public Administrador(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    
    public String getUsuario(){
        return usuario;
    }
    public String getSenha(){
        return senha;
    }
    
    public void setCpf(String usuario){
        this.usuario = usuario;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
}
