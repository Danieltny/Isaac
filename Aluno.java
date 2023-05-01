

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Aluno {
    private String ra;
    private String nome;
    private List<Disciplina> disciplinas;
    private List<Double> notas;
    
    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
        this.notas = new ArrayList<>();
    }
    
    public String getRa() {
        return ra;
    }
    
    public String getNome() {
        return nome;
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public List<Double> getNotas() {
        return notas;
    }
    
    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        notas.add(null);
    }
    
    public void setNota(int index, double nota) {
        notas.set(index, nota);
    }
    
    public double getMedia() {
        double soma = 0;
        int count = 0;
        for (Double nota : notas) {
            if (nota != null) {
                soma += nota;
                count++;
            }
        }
        return count == 0 ? 0 : soma / count;
    }
    
    @Override
    public String toString() {
        return "Aluno [ra=" + ra + ", nome=" + nome + "]";
    }
}

