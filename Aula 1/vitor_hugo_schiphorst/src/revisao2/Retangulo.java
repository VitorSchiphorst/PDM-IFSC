package revisao2;

public class Retangulo extends Forma {
    private double alturaRetangulo;
    private double larguraRetangulo;

    public Retangulo(double altura, double largura) {
        this.alturaRetangulo = altura;
        this.larguraRetangulo = largura;
    }

    @Override
    public double area() {
        return alturaRetangulo * larguraRetangulo;
    }

    @Override
    public double perimetro() {
        return 2 * (alturaRetangulo + larguraRetangulo);
    }
}
