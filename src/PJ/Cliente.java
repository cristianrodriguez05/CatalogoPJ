/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;

import FabricaAbstr.FabricaAbstracPJ;

/**
 *
 * @author acer1
 */
public class Cliente {
   
    private FabricaAbstracPJ fabrica;

    public void setFabrica(FabricaAbstracPJ fabrica) {
        this.fabrica = fabrica;   
    }
    
    public Personaje getPersonaje(){
        return fabrica.getPersonaje();
    }
    
    public void construirPersonaje(){
        fabrica.crearPersonaje();
        fabrica.crearCuerpo();
    }
    
    public void añadirArma(int sel){
        fabrica.crearArma(sel);
    }
    
    public void añadirArmaSecu(int sel){
        fabrica.crearArmSecu(sel);
    }
    
    public void añadirArmadura(int sel){
        fabrica.crearArmadura(sel);
    }
    
    public void añadirMontura(){
        fabrica.crearMontu();
    }
    public void añadirLeyenda(){
      
        fabrica.CrearLeyenda();
    }
}
