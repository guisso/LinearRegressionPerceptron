/* 
 * Material didático destinado ao curso de 
 * Programação Orientada a Objetos
 * do Bacharelado em Ciência da Computação do IFNMG 
 * - Câmpus Montes Claros.
 *
 * O uso deste material é livre e regido pela licença 
 * Creative Commons como Atribuição-NãoComercial
 * -CompartilhaIgual 4.0 Internacional:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package io.github.guisso.linearregressionperceptron;

/**
 * Classe Tuple
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 15/02/2022
 */
public class Tuple<T, U> {

    private T value0;
    private U value1;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Tuple() {

    }

    public Tuple(T value0, U value1) {
        this.value0 = value0;
        this.value1 = value1;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public T getValue0() {
        return value0;
    }

    public void setValue0(T value0) {
        this.value0 = value0;
    }

    public U getValue1() {
        return value1;
    }

    public void setValue1(U value1) {
        this.value1 = value1;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        if((value0 instanceof Double && value1 instanceof Double)
                || (value0 instanceof Float && value1 instanceof Float)) {
            return String.format("(%.3f, %.3f)", value0, value1);
        }
        return value0 + ", " + value1;
    }
    //</editor-fold>

}
