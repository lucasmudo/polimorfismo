public class Quadrado extends Forma {
    //  exercício 3
    private String nome="Quadrado";
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    //  exercício 4
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    protected double calcularPerimetro() {
        return lado*4;
    }

    @Override
    protected double calcularArea() {
        return Math.pow(lado, 2);
    }
}
