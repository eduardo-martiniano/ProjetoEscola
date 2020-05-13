/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * 
 * @author Eduardo
 */
public class FolhaPagamento {
    private double salarioBruto;
    private double inss;
    private double irrf;
    private double salarioLiquido;



    public double getSalarioBruto() {
        return salarioBruto;
    }
    
    public double getInss(){
        if (salarioBruto < 1830.29){
            this.inss = 0;
        }
        else if(salarioBruto >= 1830.29){
            this.inss = salarioBruto * 0.08;
        } else if(salarioBruto > 1830.30 && salarioBruto <= 3050.52){
            this.inss = salarioBruto * 0.09;
        } else if(salarioBruto > 3050.53 && salarioBruto < 6101.06){
            this.inss = salarioBruto * 0.11;
        } else if (salarioBruto > 6101.06){
            this.inss = 671.11;
        }
        return this.inss;
    }

    public double getIrrf() {
        double salarioSInss = salarioBruto - this.getInss();
        if(salarioSInss < 1903.98){
            this.irrf = 0;
        } else if(salarioSInss > 1903.98 && salarioSInss < 2826.66){
            this.irrf = (salarioSInss * 0.075) - 142.80;
        } else if(salarioSInss > 2826.65 && salarioSInss < 3751.06) {
            this.irrf = (salarioSInss * 0.15) - 354.8;
        } else if(salarioSInss > 3751.05 && salarioSInss < 4664.69){
            this.irrf = (salarioSInss * 0.225) - 636.13;
        } else if(salarioSInss > 4664.68){
            this.irrf = (salarioSInss * 0.275) - 869.36;
        }
        return this.irrf;
    }

    public double getSalarioLiquido() {
        this.salarioLiquido = this.salarioBruto - (this.getIrrf() + this.getInss());
        return salarioLiquido;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido - 125;
    }
    
    
    
}