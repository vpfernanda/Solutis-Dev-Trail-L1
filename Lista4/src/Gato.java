public class Gato extends AnimalTerrestreAB{
    private final String ANIMAL = "Gato";

    public Gato(String nome, int idade, double altura, double peso, String habitat) {
        super(nome, idade, altura, peso, habitat);
        this.qtdPatas = 4;
    }

    @Override
    public void comer() {
        this.qtdAlimentosIngeridos++;
    }

    @Override
    public void moverse() {
        this.distanciaPercorrida++;
    }

    @Override
    public void dormir() {
        this.horasDormidas++;
    }
}
