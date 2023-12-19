public class Pessoa {

    public String nome;
    public String genero;

    public Pessoa (String nome, String genero) {
        this.nome = nome;
        this.genero = genero;

    }

    @Override
    public String toString() {
        return  nome + " ; " + genero;
    }


}

