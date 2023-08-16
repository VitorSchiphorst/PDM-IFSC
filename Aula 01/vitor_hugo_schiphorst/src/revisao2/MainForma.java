package revisao2;

public class MainForma {

	public static void main(String[] args) {
        
        Forma circulo = new Circulo(8);
        Forma retangulo = new Retangulo(10, 2);
        Forma quadrado = new Quadrado(6);
        
        System.out.println("-------------Retângulo-------------");

        System.out.println("Área = " + retangulo.area());
        System.out.println("Perímetro = " + retangulo.perimetro());
        
        System.out.println("-------------Quadrado-------------");

        System.out.println("Área = " + quadrado.area());
        System.out.println("Perímetro = " + quadrado.perimetro());
        
        System.out.println("-------------Círculo-------------");

        System.out.println("Área = " + circulo.area());
        System.out.println("Perímetro = " + circulo.perimetro());
	}

}
