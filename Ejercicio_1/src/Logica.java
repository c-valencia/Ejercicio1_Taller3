
import java.util.ArrayList;

/** 
 * Nombre del Archivo: Logica.java
 * Autores: JULIAN GARCIA RICO (1225435) 
 *          DIEGO FERNANDO BEDOYA (1327749) 
 *          CRISTIAN ALEXANDER VALENCIA TORRES (1329454) 
 *          OSCAR STEVEN ROMERO BERON (1326750) 
 */
public class Logica {
    private ArrayList <String> respuestas;
    
  public Logica(){
      respuestas = new ArrayList <String>();
  } 
  
    public ArrayList<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
    }
  
    
    public double distanciaEntrePuntos(Coordenada a, Coordenada b){
        double respuesta = 0.0;
        respuesta = Math.pow((Math.pow((b.getX()- a.getX()),2) + Math.pow((b.getY()- a.getY()),2)),0.5); 
        return respuesta;
    } 
    
    public boolean estaEnCircunferencia(Circulo circulo, Coordenada coordenada){
        boolean respuesta = false;
        if(distanciaEntrePuntos(circulo.getCoordenada(),coordenada)<=circulo.getRadio()){
            respuesta = true;
        }
        return respuesta;
    }
    
    public String evaluar(Circulo circulo1, Circulo circulo2, Coordenada coordenada){
        String respuesta = "";
        boolean estaEnCirculo1 = estaEnCircunferencia(circulo1,coordenada);
        boolean estaEnCirculo2 = estaEnCircunferencia(circulo2,coordenada);
        
        //System.out.print("la verificacion 1 es "+estaEnCirculo1+" la verificacion 1 es "+estaEnCirculo2+"\n");
        if((estaEnCirculo1 == true) && (estaEnCirculo2== true)){
            respuesta = " -> dentro de ambas circunferencias";
        }
        if((estaEnCirculo1==true) && (estaEnCirculo2== false)){
            respuesta = " -> dentro de la circunferencia 1";
        }
        if((estaEnCirculo1==false) && (estaEnCirculo2== true)){
            respuesta = " -> dentro de la circunferencia 2";
       }
       if((estaEnCirculo1==false) && (estaEnCirculo2== false))
        {
            respuesta = " -> fuera de ambas circunferencias";
       }
        
        return respuesta;
       
    }
    
    public void evaluarColeccion(ArrayList <Circulo> circulos, ArrayList <Coordenada> coordenadas){
      
        
       for(int i = 0; i < coordenadas.size(); i++){
          String respuesta = "";
          respuesta = "("+coordenadas.get(i).getX()+","+coordenadas.get(i).getY()+")"+evaluar(circulos.get(0),circulos.get(1),coordenadas.get(i));
          respuestas.add(respuesta); 
          //System.out.print(respuesta+" \n");
       }
    }
}
