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
public class Professor extends Funcionario {
    private String Formacao;
    private String disciplina;
    
    
    

    public void cadastrar(){
        super.cadastrar();
        this.setFormacao(JOptionPane.showInputDialog(null, "Formação: "));
        this.setFormacao(JOptionPane.showInputDialog(null, "Disciplina: "));
        if (this.getNivel() == 1){
            this.setSalario(4530.00);
            
            
        }else if(this.getNivel() == 2){
            this.setSalario(5325.50);
            
            
        }else if(this.getNivel() == 3){
            this.setSalario(8568.43);
            
        folha.setSalarioBruto(this.getSalario());
        
        }
    }
        
    

    public void exibir(){
        super.exibir();
        System.out.println("Formação"+this.getFormacao());
        System.out.println("disciplina"+this.getDisciplina());
        System.out.println("Salario liquido" + this.folha.getSalarioLiquido());

        
        
    }

    public String getFormacao() {
        return Formacao;
    }

    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
}
