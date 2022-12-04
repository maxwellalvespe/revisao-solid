package srp.model;

public class Funcionario {

    private String nome;
    private Integer idade;


    private Funcionario(String nome2, Integer idade2) {
        this.nome = nome2;
        this.idade = idade2;
    }


    public static Funcionario of(String nome, Integer idade){
        return new Funcionario(nome,idade);
    }


    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s , Idade: %d", getNome(),getIdade());
    }
}
