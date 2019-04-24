/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;
import ClasesConcretas.ArmaArquero;
import ClasesConcretas.ArmaSecundariaArquero;
import ClasesConcretas.ArmaduraArquero;
import ClasesConcretas.CuerpoArquero;
import ClasesConcretas.LeyendaArquero;
import ClasesConcretas.MonturaArquero;
import FabricaAbstr.*;
/**
 *
 * @author estudiantes
 */
public class FabricaArquero extends FabricaAbstracPJ{

    @Override
    public void crearPersonaje() {
        arma=new ArmaArquero();
        armaSecu=new ArmaSecundariaArquero();
        armadura=new ArmaduraArquero();
        montura=new MonturaArquero(); 
        cuerpo=new CuerpoArquero();
      leyenda= new LeyendaArquero();
    }

    @Override
    public void crearArma(int sel) {
        personaje.setArma(arma.mostrarArma(sel));
    }

    @Override
    public void crearArmSecu(int sel) {
        personaje.setArmaSecu(armaSecu.mostrarArmaSecun(sel));
    }

    @Override
    public void crearMontu() {
        personaje.setMontura(montura.mostrarMontura());
    }

    @Override
    public void crearCuerpo() {
        personaje.setCuerpo(cuerpo.mostrarCuerpo());
    }

    @Override
    public void crearArmadura(int sel) {
        personaje.setArmadura(armadura.mostrarArmadura(sel));
    }

    @Override
    public void CrearLeyenda() {
       // System.out.println("ok");
         personaje.setLeyenda(leyenda.mostrarLeyenda());
    }

     
}
