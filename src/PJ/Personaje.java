/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJ;

/**
 *
 * @author acer1
 */
public class Personaje {

    private String arma = "vacio";
    private String armaSecu = "vacio";
    private String armadura = "vacio";
    private String montura = "vacio";
    private String cuerpo = "";
    private String leyenda = "";

    public String getLeyenda() {
        return leyenda;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public void setArma(String Arma) {
        this.arma = Arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArmaSecu(String armaSecu) {
        this.armaSecu = armaSecu;
    }

    public String getArmaSecu() {
        return armaSecu;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setMontura(String montura) {
        this.montura = montura;
    }

    public String getMontura() {
        return montura;
    }

}
