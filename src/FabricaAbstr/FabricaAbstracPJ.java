/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaAbstr;
import ClasesProducto.*;
import PJ.Personaje;
/**
 *
 * @author estudiantes
 */
public abstract class  FabricaAbstracPJ {
    protected Personaje personaje=new Personaje();
    protected Arma arma;
    protected ArmaSecundaria armaSecu;
    protected Armadura armadura;
    protected Montura montura;
    protected Cuerpo cuerpo;
    protected  Leyenda leyenda;
    
    public Personaje getPersonaje(){
        return personaje;
    }
    
    public abstract void crearPersonaje();
    public abstract void crearArma(int sel);
    public abstract void crearArmSecu(int sel);
    public abstract void crearMontu();
    public abstract void crearCuerpo();
    public abstract void crearArmadura(int sel);
    public abstract  void CrearLeyenda();
}