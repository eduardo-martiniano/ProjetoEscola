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
public class Curso {
    
    private String titulo;
    private String descricao;
    private Double valor;
    Professor professor = new Professor();
    Matricula matricula = new Matricula();

    
    
    public void cadastrarCurso(){
        this.setTitulo(JOptionPane.showInputDialog(null, "Titulo"));
        this.setDescricao(JOptionPane.showInputDialog(null, "Descrição"));
        String v = JOptionPane.showInputDialog(null, "Valor");
        this.setValor(Double.parseDouble(v));
    }
    
    public void exibirCurso(){
        System.out.println("Titulo " + this.titulo);
        System.out.println("Descrição " + this.descricao);
        System.out.println("Valor " + this.valor);

    }
    
    public void calcularMinAlunos(Double SalarioProfessor, Double precoCurso){
         Double result = SalarioProfessor/precoCurso;
         System.out.println("É necessario no minimo " + result + " Alunos");
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
}
