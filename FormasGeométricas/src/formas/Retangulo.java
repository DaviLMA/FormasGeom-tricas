package formas;

public class Retangulo extends Quadrilatero implements ICalcularArea{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return this.base * this.altura;
    }
}
