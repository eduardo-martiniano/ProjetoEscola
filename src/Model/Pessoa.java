/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author EDUARDO
 */
public abstract class Pessoa {
    private String nome;
    private String rg;
    private String cpf;
    private String anoNasci;
    private String mesNasci;
    private String sexo;
    Endereco endereco = new Endereco();
    
    
    
    public void cadastrar(){
        this.setNome(JOptionPane.showInputDialog(null, "Nome"));
        this.setRg(JOptionPane.showInputDialog(null, "RG"));
        this.setCpf(JOptionPane.showInputDialog(null, "Cpf"));
        this.setAnoNasci(JOptionPane.showInputDialog(null, "Ano de nascimento"));
        this.setMesNasci(JOptionPane.showInputDialog(null, "Mes de nascimento"));
        this.setSexo(JOptionPane.showInputDialog(null, "Sexo "));
        endereco.cadastrarEndereço(); 
        
 
        
    }
    
    public void exibir(){
        System.out.println("Nome " + this.nome);
        System.out.println("RG" + this.rg);
        System.out.println("CPF " +this.cpf);
        System.out.println("Ano de nascimento "+this.anoNasci);
        System.out.println("Mes de nascimento "+this.mesNasci);
        System.out.println("Sexo " + this.sexo);
        endereco.exibirEndereço();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAnoNasci() {
        return anoNasci;
    }

    public void setAnoNasci(String anoNasci) {
        this.anoNasci = anoNasci;
    }

    public String getMesNasci() {
        return mesNasci;
    }

    public void setMesNasci(String mesNasci) {
        this.mesNasci = mesNasci;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
