public class Retangulo extends Forma {
    //  exercício 3
    private String nome="Retangulo";
    private double altura;
    private double base;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //  exercício 4
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    protected double calcularPerimetro() {
        return (base*2) + (altura*2);
    }

    @Override
    protected double calcularArea() {
        return base * altura;
    }
}
