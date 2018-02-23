/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Daniel Ortiz Vallejo	
 */
public class Nave {
    
    //variables internas publicas
    public Image imagen = null;
    public int x = 0;
    public int y = 0;
    
    //variables internas privadas
    private boolean pulsadoIzquierda =false;
    private boolean pulsadoDerecha = false;
    
    //variables exteriores
    private int anchoPantalla;
    
    public Nave(int _anchopantalla){
	try{
	 imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));   
	}
	catch(IOException ramon){    
	}
	anchoPantalla = _anchopantalla;
    }
    
    public boolean isPulsadoIzquierda() {
	return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
	this.pulsadoIzquierda = pulsadoIzquierda;
    }

    public boolean isPulsadoDerecha() {
	return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
	this.pulsadoDerecha = pulsadoDerecha;
    }
    
    //Metodo para mover la nave
    public void mueve(){
	if(pulsadoIzquierda && x>0){
	    x--;
	}
	if(pulsadoDerecha && x<anchoPantalla-imagen.getWidth(null)){
	    x++;
	}
    }
}
