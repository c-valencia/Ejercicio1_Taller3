
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cristian
 */
public class Prueba {
     public static void main(String args[]) {
        Logica logica = new Logica();    
        Lectura lectura = new Lectura();
       logica.evaluarColeccion(lectura.LeerCirculo(), lectura.leerCoordenada());
        Ventana ventana = new Ventana(logica.getRespuestas());
        ventana.setVisible(true);
        
//       //Coordenadas para prueba coordenadas
//        Coordenada a = new Coordenada(1,1);
//        Coordenada b = new Coordenada(2,2);
//        Coordenada c = new Coordenada(1,3);
//        
//       //Circulos para pruebas
//        Coordenada cCirculo1 = new Coordenada(3,3);
//        Coordenada cCirculo2 = new Coordenada(2,4);
//        
//        Circulo circulo1 = new Circulo(20, cCirculo1);
//        Circulo circulo2 = new Circulo(1, cCirculo2);
//        
//         ArrayList <Coordenada> coordenadas = new ArrayList <Coordenada>();
//          ArrayList <Circulo> circulos = new ArrayList <Circulo>();
//          
//          coordenadas.add(a);
//          coordenadas.add(b);
//          coordenadas.add(c);
//          
//          circulos.add(circulo1);
//          circulos.add(circulo2);
//          
        
 //        for(int i = 0; i < logica.getRespuestas().size(); i++){
//            System.out.print(logica.getRespuestas().get(i)+"\n");
//        }        

    }
}
