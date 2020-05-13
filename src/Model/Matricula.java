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
public class Matricula {
    
    
    private int id;
    private int diaMatricula;
    private String mesMatricula;
    public int anoMatricula;
    public Double nota;
    
    public void matricularAluno(){
        String id = JOptionPane.showInputDialog(null, "ID");
        this.setId(Integer.parseInt(id));
        String diaDaMatricula = JOptionPane.showInputDialog(null, "Dia da matricula");
        this.setDiaMatricula(Integer.parseInt(diaDaMatricula));
        this.setMesMatricula(JOptionPane.showInputDialog(null, "Mes da matricula"));
        String anoMatriculaa = JOptionPane.showInputDialog(null, "Ano da matricula");
        this.setAnoMatricula(Integer.parseInt(anoMatriculaa));
        String Nota = JOptionPane.showInputDialog(null, "Nota");
        this.setNota(Double.parseDouble(Nota));
                

        
        
        
    }
    
    public void exibirMatricula(){
        System.out.println("ID "+this.id);
        System.out.println("Dia da matricula "+this.diaMatricula);
        System.out.println("Mes da matricula "+this.mesMatricula);
        System.out.println("Ano da matricua "+this.anoMatricula);
        System.out.println("Nota "+this.nota);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiaMatricula() {
        return diaMatricula;
    }

    public void setDiaMatricula(int diaMatricula) {
        this.diaMatricula = diaMatricula;
    }

    public String getMesMatricula() {
        return mesMatricula;
    }

    public void setMesMatricula(String mesMatricula) {
        this.mesMatricula = mesMatricula;
    }

    public int getAnoMatricula() {
        return anoMatricula;
    }

    public void setAnoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    
    
    
}
