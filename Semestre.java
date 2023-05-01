/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author danie
 */
public class Semestre {
    private List<Disciplina> disciplinas;
    private boolean cursado;
    
    public Semestre(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
        this.cursado = false;
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public boolean isCursado() {
        return cursado;
    }
    
    public void setCursado(boolean cursado) {
        this.cursado = cursado;
    }
    
    @Override
    public String toString() {
        return "Semestre [disciplinas=" + disciplinas + ", cursado=" + cursado + "]";
    }
}

