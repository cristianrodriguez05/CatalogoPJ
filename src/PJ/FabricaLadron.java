/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;
import ClasesConcretas.ArmaGuerrero;
import ClasesConcretas.ArmaLadron;
import ClasesConcretas.ArmaSecundariaGuerrero;
import ClasesConcretas.ArmaSecundariaLadron;
import ClasesConcretas.ArmaduraGuerrero;
import ClasesConcretas.ArmaduraLadron;
import ClasesConcretas.CuerpoGuerrero;
import ClasesConcretas.CuerpoLadron;
import ClasesConcretas.LeyendaArquero;
import ClasesConcretas.LeyendaLadron;
import ClasesConcretas.MonturaGuerrero;
import ClasesConcretas.MonturaLadron;
import ClasesProducto.Arma;
import ClasesProducto.ArmaSecundaria;
import ClasesProducto.Armadura;
import ClasesProducto.Montura;
import FabricaAbstr.*;
import ClasesProducto.Cuerpo;
/**
 *
 * @author estudiantes
 */
public class FabricaLadron extends FabricaAbstracPJ{

    @Override
    public void crearPersonaje() {
        arma=new ArmaLadron();
        armaSecu=new ArmaSecundariaLadron();
        armadura=new ArmaduraLadron();
        montura=new MonturaLadron(); 
        cuerpo=new CuerpoLadron();
     leyenda= new LeyendaLadron();
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
