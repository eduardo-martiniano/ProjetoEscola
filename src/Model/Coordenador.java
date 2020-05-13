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
public class Coordenador extends Funcionario {
    
    private String area;
    private Double plusSalario;
    
    
    
    

    public void cadastrar(){
        super.cadastrar();
        this.setArea(JOptionPane.showInputDialog(null, "Area"));
        super.folha.setSalarioBruto(super.folha.getSalarioBruto() + super.folha.getSalarioBruto() * (15/100));
 
    }
    
    

    public  void exibir(){
        super.exibir();
        System.out.println("AREA " + this.area);
        System.out.println("Salario liquido com o plus" + super.folha.getSalarioLiquido());

                
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getPlusSalario() {
        return plusSalario;
    }

    public void setPlusSalario(Double plusSalario) {
        this.plusSalario = plusSalario;
    }
    
    
}
