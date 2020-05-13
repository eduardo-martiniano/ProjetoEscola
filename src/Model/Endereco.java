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
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String UF; 
    
    
    
    public void cadastrarEndereço(){
        this.setLogradouro(JOptionPane.showInputDialog(null, "Logradouro "));
        this.setNumero(JOptionPane.showInputDialog(null, "Numero "));
        this.setComplemento(JOptionPane.showInputDialog(null, "Complemento "));
        this.setCep(JOptionPane.showInputDialog(null, "CEP "));
        this.setBairro(JOptionPane.showInputDialog(null, "Bairro "));
        this.setCidade(JOptionPane.showInputDialog(null, "Cidade "));
        this.setUF(JOptionPane.showInputDialog(null, "UF "));

    }
    public void exibirEndereço(){
        System.out.println("Logradouro "+this.logradouro );
        System.out.println("numero "+this.numero );
        System.out.println("complemento "+this.complemento );
        System.out.println("cep "+this.cep );
        System.out.println("bairro "+this.bairro );
        System.out.println("cidade "+this.cidade );
        System.out.println("UF "+this.UF );
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
    
    
}
