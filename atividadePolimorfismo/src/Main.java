public class Main {
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(2);
        System.out.println(quadrado.getNome());
        System.out.println("Area: " + quadrado.calcularArea());
        System.out.println("Perimetro: " + quadrado.calcularPerimetro());
        System.out.println();

        Forma retangulo = new Retangulo(2, 3);
        System.out.println(retangulo.getNome());
        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());
        System.out.println();

        Forma triangulo = new Triangulo(3);
        System.out.println(triangulo.getNome());
        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        System.out.println();

        Forma circulo = new Circulo(3);
        System.out.println(circulo.getNome());
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());

    }
}
