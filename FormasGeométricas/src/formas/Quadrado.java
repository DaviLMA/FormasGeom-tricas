package formas;

public class Quadrado extends Quadrilatero implements ICalcularArea{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }
}
