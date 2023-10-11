/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package strategy;
import java.util.Scanner;

/**
 *
 * @author renan
 */
public class Main {

    public static void main(String[] args) {
        
        int tipo;
        
        do{
            System.out.println("Selecione o tipo de média que deseja:\n 1 - Média Aritmética\n 2 - Média Geométrica");
            Scanner input = new Scanner(System.in);
            tipo = input.nextInt();
        }while(tipo<1 || tipo>2);
        
        
        if(tipo==1){
            Aritmetica calculo = new Aritmetica();
            Disciplina d = new Disciplina(calculo);
            d.setNome("Padrões de Desenvolvimento");
            d.setP1(5);
            d.setP2(5);
            d.CalcularMedia();
            System.out.println(String.format("\nNotas da disciplina: %s\n P1: %.2f\n P2: %.2f\n Media: %.2f\n Situacao: %s\n",d.getNome(), d.getP1(),d.getP2(),d.getMedia(),d.getSituacao()));
        }
        else{
            Geometrica calculo = new Geometrica();
            Disciplina d = new Disciplina(calculo);
            d.setNome("Padrões de Desenvolvimento");
            d.setP1(5);
            d.setP2(5);
            d.CalcularMedia();
            System.out.println(String.format("\nNotas da disciplina: %s\n P1: %.2f\n P2: %.2f\n Media: %.2f\n Situacao: %s\n",d.getNome(), d.getP1(),d.getP2(),d.getMedia(),d.getSituacao()));
        }
    }
}
