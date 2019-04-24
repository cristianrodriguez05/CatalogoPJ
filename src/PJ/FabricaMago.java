/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;

import ClasesConcretas.ArmaMago;
import ClasesConcretas.ArmaSecundariaMago;
import ClasesConcretas.ArmaduraMago;
import ClasesConcretas.CuerpoMago;
import ClasesConcretas.LeyendaArquero;
import ClasesConcretas.LeyendaMAgo;
import ClasesConcretas.MonturaMago;
import FabricaAbstr.*;

/**
 *
 * @author estudiantes
 */
public class FabricaMago extends FabricaAbstracPJ {

    @Override
    public void crearPersonaje() {
        arma = new ArmaMago();
        armaSecu = new ArmaSecundariaMago();
        armadura = new ArmaduraMago();
        montura = new MonturaMago();
        cuerpo = new CuerpoMago();
        leyenda = new LeyendaMAgo();
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
