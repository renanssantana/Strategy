/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author renan
 */
public class Aritmetica implements ICalcMedia {
     @Override
    public double calculaMedia(double P1, double P2) {
        return (P1+P2)/2;
    }

    @Override
    public String Situacao(double Media) {
        if (Media>5){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
}
