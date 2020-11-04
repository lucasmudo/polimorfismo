public class Triangulo extends Forma{
    //  exercício 3
    private String nome="Triangulo";
    private double lado;

    public Triangulo(double lado){
        this.lado = lado;
    }

    //  exercício 4
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    protected double calcularPerimetro() {
        return lado*3;
    }

    @Override
    protected double calcularArea() {
        return (Math.pow(lado, 2)*Math.sqrt(3))/4;
    }
}
