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
public class Funcionario extends Pessoa {
    
    private int matricula;
    private String setor;
    private String cargo;
    private int nivel;
    private Double salario;
    FolhaPagamento folha = new FolhaPagamento();
    
    
    

    public void cadastrar(){
        super.cadastrar();
        String m = JOptionPane.showInputDialog(null, "MATRICULA");
        this.setMatricula(Integer.parseInt(m));
        this.setSetor(JOptionPane.showInputDialog(null, "SETOR"));
        this.setCargo(JOptionPane.showInputDialog(null, "CARGO"));
        String n = JOptionPane.showInputDialog(null, "NIVEL");
        this.setNivel(Integer.parseInt(n));
        if (n.equals("1")){
            this.salario = 1520.25;
            
            
        }else if(n.equals("2")){
            this.salario = 2362.67;
            
            
        }else if(n.equals("3")){
            this.salario = 2988.92;
            
            
        }else if(n.equals("4")){
            this.salario = 3572.77;
            
            
        }else{
            this.salario = 4878.67;
            
        }
        folha.setSalarioBruto(this.salario);
        
        
    }

    public void exibir(){
        super.exibir();
        System.out.println("MATRICULA" + this.matricula);
        System.out.println("SETOR" + this.setor);
        System.out.println("CARGO" + this.cargo);
        System.out.println("NIVEL" + this.nivel);
        System.out.println("SALARIO LIQUIDO" + folha.getSalarioLiquido());
        
        

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    


    
    
    
    
    
    
    
}
