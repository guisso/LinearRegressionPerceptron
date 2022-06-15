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

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Perceptron implementation without classification activation function.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 15/02/2022
 * @see ThreeParametersFunction
 */
public class Perceptron {

    /**
     * Apply linear regression learning.
     * 
     * @param inputs Data for x-axis
     * @param outputs Data for y-axis
     * @param epochs Number of iterations to obtain results
     * @param learningRate Learning rate
     * @return Slope and y-intercept for line equation
     */
    public static Tuple<Double, Double> train(
            List<Double> inputs,
            List<Double> outputs,
            Integer epochs,
            Double learningRate) {

        // Weights
        double w0 = 0.0;
        double w1 = 0.0;

        // Auxiliary variables
        double prediction;
        double error;

        // Evaluation function: f(x) = mx + b
        ThreeParametersFunction<Double, Double, Double, Double> 
                f = (m, x, b) -> m * x + b;

        // Join lists for iteration as tuples pair
        List<Tuple<Double, Double>> data
                = IntStream
                        // Indexes from 0 to n
                        .range(0, Math.min(inputs.size(), outputs.size()))
                        // Tuples from inputs/outputs pairs
                        .mapToObj(i
                                -> new Tuple<Double, Double>(
                                inputs.get(i), outputs.get(i)))
                        // Join tuples as list
                        .collect(Collectors.toList());

        // Displays received data
        // for (Tuple<Double, Double> d : data) { ...
        data.forEach(d -> {
            System.out.println(">> " + d.getValue0()
                    + "," + d.getValue1());
        });

        // Epochs
        for (int epoch = 0; epoch < epochs; epoch++) {
            // Learning...
            for (Tuple<Double, Double> d : data) {
                prediction = f.apply(w1, d.getValue0(), w0);
                error = d.getValue1() - prediction;
                // Slope
                w1 += error * learningRate * d.getValue0();
                // Intercept
                w0 += error * learningRate;
            }

            // Trace learning...
            if (epoch % 10 == 0) {
                // https://alvinalexander.com/programming/printf-format-cheat-sheet/
                System.out.printf("%04d > %.16f, %.16f\n",
                        epoch, w1, w0);
            }
        }

        return new Tuple(w1, w0);
    }

}

/**
 * A sketch for the three parameter function
 * 
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @param <T> Return type
 * @param <U> First type
 * @param <V> Second type
 * @param <X> Third type
 */
@FunctionalInterface
interface ThreeParametersFunction<T, U, V, X> {
    public T apply(U u, V v, X x);
}
