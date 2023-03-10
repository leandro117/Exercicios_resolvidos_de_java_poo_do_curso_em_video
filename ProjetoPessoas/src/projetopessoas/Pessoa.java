
package projetopessoas;

public class Pessoa {
    
    //atributos
    private String nome;
    private int idade;
    private String sexo;

    //contrutor
    /*public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
     }
    */
    // metodos da classe
    public void fazerAniv() {
        this.setIdade(this.getIdade() + 1);
    }
  
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" 
                + "\n nome=" + nome 
                + "\n idade=" + idade 
                + "\n sexo=" + sexo + '}';
    }
}
