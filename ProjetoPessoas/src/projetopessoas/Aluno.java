
package projetopessoas;

public class Aluno extends Pessoa{
    //atributos
    private int matr;
    private String curso;
    
    //construtor
    /*public Aluno(int matr, String curso, String nome, int idade, String sexo) {
        this.matr = matr;
        this.curso = curso;
    }
    */
    //metodos da classe
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
    }
    
    //metodos especiais
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
