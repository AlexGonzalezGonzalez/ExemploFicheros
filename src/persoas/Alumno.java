/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persoas;

/**
 *
 * @author estudios
 */
public class Alumno {
    private String nome;
    private int nota;

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Alumno() {
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", nota=" + nota;
    }
    
}
