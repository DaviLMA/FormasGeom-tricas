package formas;

public class Losango extends Quadrilatero implements ICalcularArea{
    private double diagonalMenor;
    private double diagonalMaior;

    public Losango(double diagonalMenor, double diagonalMaior) {
        this.diagonalMenor = diagonalMenor;
        this.diagonalMaior = diagonalMaior;
    }

    @Override
    public double calcularArea() {
        return (this.diagonalMaior * this.diagonalMenor)/2;
    }
}
