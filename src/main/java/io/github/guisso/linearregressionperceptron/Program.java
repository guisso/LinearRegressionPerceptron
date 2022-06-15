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

import java.util.ArrayList;
import java.util.List;

/**
 * Perceptron tests.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 15/02/2022
 */
public class Program {

    public static void main(String[] args) {
        List<Double> entradas = new ArrayList<>();
        List<Double> saidas = new ArrayList<>();

        //<editor-fold defaultstate="collapsed" desc="Basic inputs/outputs">
        entradas.add(1.0);
        entradas.add(3.0);
        entradas.add(5.0);

        saidas.add(3.0);
        saidas.add(7.0);
        saidas.add(11.0);
        //</editor-fold>
        //
        // Datasets
        // https://college.cengage.com/mathematics/brase/understandable_statistics/7e/students/datasets/slr/frames/frame.html
        //
        //<editor-fold defaultstate="collapsed" desc="National Unemployment Male Vs. Female">
        //
        // Input: male unemployment
        // Output: female unemployment
        // 
//        entradas.add(2.900000095);
//        entradas.add(6.699999809);
//        entradas.add(4.900000095);
//        entradas.add(7.900000095);
//        entradas.add(9.800000191);
//        entradas.add(6.900000095);
//        entradas.add(6.099999905);
//        entradas.add(6.199999809);
//        entradas.add(6.0);
//        entradas.add(5.099999905);
//        entradas.add(4.699999809);
//        entradas.add(4.400000095);
//        entradas.add(5.800000191);
//
//        saidas.add(4.0);
//        saidas.add(7.400000095);
//        saidas.add(5.0);
//        saidas.add(7.199999809);
//        saidas.add(7.900000095);
//        saidas.add(6.099999905);
//        saidas.add(6.0);
//        saidas.add(5.800000191);
//        saidas.add(5.199999809);
//        saidas.add(4.199999809);
//        saidas.add(4.0);
//        saidas.add(4.400000095);
//        saidas.add(5.199999809);
        //</editor-fold>
        //
        //<editor-fold defaultstate="collapsed" desc="Prehistoric Pueblos">
        //
        // Input: estimated year of initial occupation
        // Output: estimated year of end of occupation
        //
//        entradas.add(1.000);
//        entradas.add(1.125);
//        entradas.add(1.087);
//        entradas.add(1.070);
//        entradas.add(1.100);
//        entradas.add(1.150);
//        entradas.add(1.250);
//        entradas.add(1.150);
//        entradas.add(1.100);
//        entradas.add(1.350);
//        entradas.add(1.275);
//        entradas.add(1.375);
//        entradas.add(1.175);
//        entradas.add(1.200);
//        entradas.add(1.175);
//        entradas.add(1.300);
//        entradas.add(1.260);
//        entradas.add(1.330);
//        entradas.add(1.325);
//        entradas.add(1.200);
//        entradas.add(1.225);
//        entradas.add(1.090);
//        entradas.add(1.075);
//        entradas.add(1.080);
//        entradas.add(1.080);
//        entradas.add(1.180);
//        entradas.add(1.225);
//        entradas.add(1.175);
//        entradas.add(1.250);
//        entradas.add(1.250);
//        entradas.add(1.125);
//        entradas.add(.750);
//        entradas.add(.700);
//        entradas.add(.900);
//        entradas.add(.900);
//        entradas.add(.850);
//
//        saidas.add(1.050);
//        saidas.add(1.150);
//        saidas.add(1.213);
//        saidas.add(1.275);
//        saidas.add(1.300);
//        saidas.add(1.300);
//        saidas.add(1.400);
//        saidas.add(1.400);
//        saidas.add(1.250);
//        saidas.add(1.830);
//        saidas.add(1.350);
//        saidas.add(1.450);
//        saidas.add(1.300);
//        saidas.add(1.300);
//        saidas.add(1.275);
//        saidas.add(1.375);
//        saidas.add(1.285);
//        saidas.add(1.400);
//        saidas.add(1.400);
//        saidas.add(1.285);
//        saidas.add(1.275);
//        saidas.add(1.135);
//        saidas.add(1.250);
//        saidas.add(1.275);
//        saidas.add(1.150);
//        saidas.add(1.250);
//        saidas.add(1.275);
//        saidas.add(1.225);
//        saidas.add(1.280);
//        saidas.add(1.300);
//        saidas.add(1.250);
//        saidas.add(1.175);
//        saidas.add(1.300);
//        saidas.add(1.250);
//        saidas.add(1.300);
//        saidas.add(1.200);
        //</editor-fold>
        //
        //<editor-fold defaultstate="collapsed" desc="Sweden Insurance">
//        entradas.add(108d);
//        entradas.add(19d);
//        entradas.add(13d);
//        entradas.add(124d);
//        entradas.add(40d);
//        entradas.add(57d);
//        entradas.add(23d);
//        entradas.add(14d);
//        entradas.add(45d);
//        entradas.add(10d);
//        entradas.add(5d);
//        entradas.add(48d);
//        entradas.add(11d);
//        entradas.add(23d);
//        entradas.add(7d);
//        entradas.add(2d);
//        entradas.add(24d);
//        entradas.add(6d);
//        entradas.add(3d);
//        entradas.add(23d);
//        entradas.add(6d);
//        entradas.add(9d);
//        entradas.add(9d);
//        entradas.add(3d);
//        entradas.add(29d);
//        entradas.add(7d);
//        entradas.add(4d);
//        entradas.add(20d);
//        entradas.add(7d);
//        entradas.add(4d);
//        entradas.add(0d);
//        entradas.add(25d);
//        entradas.add(6d);
//        entradas.add(5d);
//        entradas.add(22d);
//        entradas.add(11d);
//        entradas.add(61d);
//        entradas.add(12d);
//        entradas.add(4d);
//        entradas.add(16d);
//        entradas.add(13d);
//        entradas.add(60d);
//        entradas.add(41d);
//        entradas.add(37d);
//        entradas.add(55d);
//        entradas.add(41d);
//        entradas.add(11d);
//        entradas.add(27d);
//        entradas.add(8d);
//        entradas.add(3d);
//        entradas.add(17d);
//        entradas.add(13d);
//        entradas.add(13d);
//        entradas.add(15d);
//        entradas.add(8d);
//        entradas.add(29d);
//        entradas.add(30d);
//        entradas.add(24d);
//        entradas.add(9d);
//        entradas.add(31d);
//        entradas.add(14d);
//        entradas.add(53d);
//        entradas.add(26d);
//
//        saidas.add(392.5d);
//        saidas.add(46.2d);
//        saidas.add(15.7d);
//        saidas.add(422.2d);
//        saidas.add(119.4d);
//        saidas.add(170.9d);
//        saidas.add(56.9d);
//        saidas.add(77.5d);
//        saidas.add(214d);
//        saidas.add(65.3d);
//        saidas.add(20.9d);
//        saidas.add(248.1d);
//        saidas.add(23.5d);
//        saidas.add(39.6d);
//        saidas.add(48.8d);
//        saidas.add(6.6d);
//        saidas.add(134.9d);
//        saidas.add(50.9d);
//        saidas.add(4.4d);
//        saidas.add(113d);
//        saidas.add(14.8d);
//        saidas.add(48.7d);
//        saidas.add(52.1d);
//        saidas.add(13.2d);
//        saidas.add(103.9d);
//        saidas.add(77.5d);
//        saidas.add(11.8d);
//        saidas.add(98.1d);
//        saidas.add(27.9d);
//        saidas.add(38.1d);
//        saidas.add(0d);
//        saidas.add(69.2d);
//        saidas.add(14.6d);
//        saidas.add(40.3d);
//        saidas.add(161.5d);
//        saidas.add(57.2d);
//        saidas.add(217.6d);
//        saidas.add(58.1d);
//        saidas.add(12.6d);
//        saidas.add(59.6d);
//        saidas.add(89.9d);
//        saidas.add(202.4d);
//        saidas.add(181.3d);
//        saidas.add(152.8d);
//        saidas.add(162.8d);
//        saidas.add(73.4d);
//        saidas.add(21.3d);
//        saidas.add(92.6d);
//        saidas.add(76.1d);
//        saidas.add(39.9d);
//        saidas.add(142.1d);
//        saidas.add(93d);
//        saidas.add(31.9d);
//        saidas.add(32.1d);
//        saidas.add(55.6d);
//        saidas.add(133.3d);
//        saidas.add(194.5d);
//        saidas.add(137.9d);
//        saidas.add(87.4d);
//        saidas.add(209.8d);
//        saidas.add(95.5d);
//        saidas.add(244.6d);
//        saidas.add(187.5d);
        //</editor-fold>
        //

        Tuple lineEquation = Perceptron.train(entradas, saidas, 2000, .025);

        System.out.println(lineEquation);

        System.out.printf(">> y = %.3fx + %.3f\n",
                lineEquation.getValue0(), lineEquation.getValue1());

    }
}
