package formas;

public class Circulo implements ICalcularArea {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (Math.pow(raio,2));
    }
}
