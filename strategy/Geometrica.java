/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author renan
 */
public class Geometrica implements ICalcMedia {
     @Override
    public double calculaMedia(double P1, double P2) {
        return Math.sqrt(P1*P2);
    }

    @Override
    public String Situacao(double Media) {
        if (Media>7) {
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
}
