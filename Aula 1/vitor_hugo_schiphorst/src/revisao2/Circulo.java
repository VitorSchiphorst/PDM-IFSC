package revisao2;

public class Circulo extends Forma {
    private double raioCirculo;

    public Circulo(double raioCirculo) {
        this.raioCirculo = raioCirculo;
    }

    @Override
    public double area() {
        return Math.PI * raioCirculo * raioCirculo;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raioCirculo;
    }
}