public class Circulo extends Forma {
    //  exercício 3
    private String nome = "Circulo";
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    //  exercício 4
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    protected double calcularPerimetro() {
        return raio * 2 * Math.PI;
    }

    @Override
    protected double calcularArea() {
        return Math.pow(raio, 2) * Math.PI;
    }
}
