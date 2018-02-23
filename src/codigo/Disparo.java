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
public class Disparo {
     
    //variables internas privadas
    public Image imagen = null;
    private int x = 0;
    private int y = 0;
    private boolean disparado = false;
    
    //variables exteriores
    private int altoPantalla;
    
    public Disparo(int _altoPantalla){
	try{
	    imagen = ImageIO.read(getClass().getResource("/imagenes/disparo.png"));
	    altoPantalla = _altoPantalla;
	}
	catch(IOException e){
	    altoPantalla =_altoPantalla;
	}
    }

    public int getX() {
	return x;
    }

    public void setX(int x) {
	this.x = x;
    }

    public int getY() {
	return y;
    }

    public void setY(int y) {
	this.y = y;
    }

    public boolean isDisparado() {
	return disparado;
    }

    public void setDisparado(boolean disparado) {
	this.disparado = disparado;
    }
    
    public void mueve(){
	if(y>0){
	    y--;
	}
    }
    public void posicionaDisparo(Nave _nave){
	x = _nave.x+_nave.imagen.getWidth(null)/2 -imagen.getWidth(null)/2;
	y = _nave.y;
    }
}
