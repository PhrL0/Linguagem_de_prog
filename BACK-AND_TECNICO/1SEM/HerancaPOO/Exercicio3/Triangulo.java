package Exercicio3;

public class Triangulo extends Figura2D {

    private String tipo;

    public String getTipo() {
        return tipo;
    }
    public double calcArea(){
        double area = (getBase() * getAltura())/2;

        return  area;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
