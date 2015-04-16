/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cristian
 */
public class Circulo {

  
    private double radio;
    private Coordenada coordenada;
    
    public Circulo(int radio, Coordenada coordenada){
        this.coordenada = coordenada;
        this.radio = radio;
    }
    
     public Circulo(){
        this.coordenada = new Coordenada();
        this.radio = 0;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }
    
      public double getRadio() {
        return radio;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }
}
