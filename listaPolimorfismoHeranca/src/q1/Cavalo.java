package q1;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cavalo relinchou.");
    }

    public void correr(){
        System.out.println("O cavalo correu.");
    }
}
