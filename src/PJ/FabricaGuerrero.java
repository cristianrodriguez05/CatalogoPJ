/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;
import ClasesConcretas.ArmaGuerrero;
import ClasesConcretas.ArmaSecundariaGuerrero;
import ClasesConcretas.ArmaduraGuerrero;
import ClasesConcretas.CuerpoGuerrero;
import ClasesConcretas.LeyendaGuerrero;
import ClasesConcretas.MonturaGuerrero;
import FabricaAbstr.*;
/**
 *
 * @author estudiantes
 */
public class FabricaGuerrero extends FabricaAbstracPJ{

    @Override
    public void crearPersonaje() {
        arma=new ArmaGuerrero();
        armaSecu=new ArmaSecundariaGuerrero();
        armadura=new ArmaduraGuerrero();
        montura=new MonturaGuerrero(); 
        cuerpo=new CuerpoGuerrero();
        leyenda = new LeyendaGuerrero();
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
         personaje.setLeyenda(leyenda.mostrarLeyenda());
    }

     
}
