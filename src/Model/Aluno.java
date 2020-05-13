/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author EDUARDO
 */
public class Aluno extends Pessoa {
    
    private int codigo;
    private String interesse;
    private String celular;
    private String email;
    Matricula matricula = new Matricula();
    



    public void cadastrar() {
        super.cadastrar();


        this.setCodigo(1);
        this.setInteresse(JOptionPane.showInputDialog(null, "Interesse"));
        this.setCelular(JOptionPane.showInputDialog(null, "Celular"));
        this.setEmail(JOptionPane.showInputDialog(null, "Email"));
        matricula.matricularAluno();
        
        
        

        
        
    }
    


    public void exibir() {
        super.exibir(); 
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Interesse: "+this.getInteresse());
        System.out.println("Celuar: "+this.getCelular());
        System.out.println("Email: "+this.getEmail());
        matricula.exibirMatricula();
        
    }
    



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
   
   
    
}
