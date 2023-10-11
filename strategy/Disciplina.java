/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author renan
 */
public class Disciplina {
    
    private ICalcMedia calcMedia;
    private double Media;
    private String Nome;
    private double P1;
    private double P2;
    private String Situacao;
    
    public Disciplina(ICalcMedia calcMedia){
        this.calcMedia = calcMedia;
    }
    
    public void CalcularMedia(){
        Media = calcMedia.calculaMedia(this.P1, this.P2);
        Situacao = calcMedia.Situacao(this.Media);
    }
    
    /**
     * @return the Media
     */
    public double getMedia() {
        return Media;
    }

    /**
     * @param Media the Media to set
     */
    public void setMedia(double Media) {
        this.Media = Media;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the P1
     */
    public double getP1() {
        return P1;
    }

    /**
     * @param P1 the P1 to set
     */
    public void setP1(double P1) {
        
        if(P1<0 || P1>10){
            return;
        }
        
        this.P1 = P1;
    }

    /**
     * @return the P2
     */
    public double getP2() {
        return P2;
    }

    /**
     * @param P2 the P2 to set
     */
    public void setP2(double P2) {
        
        if(P2<0 || P2>10){
            return;
        }
        
        this.P2 = P2;
    }

    /**
     * @return the Situacao
     */
    public String getSituacao() {
        return Situacao;
    }

    /**
     * @param Situacao the Situacao to set
     */
    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }
}
