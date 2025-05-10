package ec.edu.ups.calculadora.modelo;

import java.util.Objects;

public class Calculadora implements  IOperacion{
    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public Calculadora() {}

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Calculadora operacion = (Calculadora) o;
        return Double.compare(numero1, operacion.numero1) == 0 && Double.compare(numero2, operacion.numero2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero1, numero2);
    }

    @Override
    public String toString() {
        return "---- Operación ---- " +
                "\nNumero 1: " + numero1 +
                "\nNumero 2: " + numero2 ;
    }

    @Override
    public double sumar() {
        return numero1 + numero2;
    }

    @Override
    public double restar() {
        return numero1 - numero2;
    }

    @Override
    public double multiplicar() {
        return numero1 * numero2;
    }

    @Override
    public double division() {
        if (numero2 == 0) {
            System.out.println("No se puede dividir entre 0");
        }else{
            return numero2 / numero1;
        }
        return 0;
    }
}

