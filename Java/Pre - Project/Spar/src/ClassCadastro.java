/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class ClassCadastro {
    private String nome;
    private String telefone;
    private double cpf;
    private float totalGasto = 0;

    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public double getCpf(){
        return cpf;
    }
    public float getTotalGasto(){ return totalGasto;}
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setCpf(double cpf){
        this.cpf = cpf;
    }
    public void setTotalGasto(float valor){
        this.totalGasto += valor;
    }
}
