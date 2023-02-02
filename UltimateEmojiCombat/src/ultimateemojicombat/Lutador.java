package ultimateemojicombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //metodos da classe
    public void apresentar(){
     System.out.println("Nome: " + this.getNome());
     System.out.println("Nacionalidade: " + this.getNacionalidade());
     System.out.println("Idade: " + this.getIdade());
     System.out.println("Altura: " + this.getAltura());
     System.out.println("Peso: " + this.getPeso());
     System.out.println("Vitórias: " + this.getVitorias());
     System.out.println("Derrotas: " + this.getDerrotas());
     System.out.println("Empates: " + this.getEmpates());
    }
            
    public void status() {
    System.out.println(this.getNome() + "é um peso: " + this.getCategoria());
    System.out.println("Vitória: " + this.getVitorias());
    System.out.println("Derrota: " + this.getDerrotas());
    System.out.println("Empate: " + this.getEmpates());
    }
            
    public void ganharLuta() {
     this.setVitorias(this.getVitorias() + 1);
    }
            
    public void perderLuta() {
     this.setDerrotas(this.getDerrotas() + 1);
    }
            
    public void empatarLuta() {
     this.setEmpates(this.getEmpates() + 1);
    }
    
    //metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52) {
         this.categoria = "Inválido";
        } else if (this.getPeso() <= 72) {
         this.categoria = "Peso Leve";
        } else if (this.getPeso() <= 83) {
         this.categoria = "Peso Médio";
        } else if (this.getPeso() <= 120) {
         this.categoria = "Peso Pesado";
        } else {
         this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
