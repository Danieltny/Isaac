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
public class universidade {
    private List<Aluno> alunos;
    private List<Semestre> semestres;
    
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void excluirAluno(String ra) {
        Aluno aluno = buscarAluno(ra);
        if (aluno != null) {
            alunos.remove(aluno);
        }
    }
    
    public void cadastrarDisciplina(String ra, Disciplina disciplina) {
        Aluno aluno = buscarAluno(ra);
        if (aluno != null) {
            aluno.addDisciplina(disciplina);
        }
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    public List<Aluno> getAlunosDisciplina(Disciplina disciplina) {
        List<Aluno> alunosDisciplina = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getDisciplinas().contains(disciplina)) {
                alunosDisciplina.add(aluno);
            }
        }
        return alunosDisciplina;
    }
    
    public List<Disciplina> getDisciplinasAluno(String ra) {
        Aluno aluno = buscarAluno(ra);
        if (aluno != null) {
            return aluno.getDisciplinas();
        }
        return null;
    }
    
    public List<Double> getNotasAluno(String ra) {
        Aluno aluno = buscarAluno(ra);
        if (aluno != null) {
            return aluno.getNotas();
        }
        return null;
    }
    
    public void incluirNotasSemestre(List<Double> notas) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            for (int j = 0; j < notas.size(); j++) {
                if (aluno.getNotas().get(j) == null) {
                    aluno.setNota(j, notas.get(j));
                }
            }
        }
    }
    
    private Aluno buscarAluno(String ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(ra)) {
                return aluno;
            }
        }
        return null;
    }
}

