/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lord.of.steel;

/**
 *
 * @author danie
 */
public class Personaje {
    protected int forca;
    protected int constitucio;
    protected int velocitat;
    protected int intelligencia;
    protected int sort;
    Arma arma;
    protected int pex;
    protected int niv;
    
    //Caracteriscas derivadas
    protected double ps;
    protected double pd;
    protected double pe;
    protected double pa;
    
    
    public Personaje(int forca, int constitucio, 
                      int velocitat, int intelligencia, 
                      int sort,Arma arma, int pex, int niv){
        this.forca = forca;
        this.constitucio = constitucio;
        this.velocitat = velocitat;
        this.intelligencia = intelligencia;
        this.sort = sort;
        this.arma = arma;
        this.pex = 0;
        this.niv = 0;
        CalculaLasCaracteristicasDerivadas();
    }
    
    
    protected void CalculaLasCaracteristicasDerivadas(){
        int wpow = arma.getWpow();
        int wvel = arma.getWvel();
        ps = constitucio + forca;
        pd = (forca + wpow) / 4;
        pa = intelligencia + sort + wvel;
        pe = velocitat + sort + intelligencia;   
    }

    public void subirDeNivel(){
        this.niv++;
        this.constitucio++;
        this.forca++;
        this.intelligencia++;
        this.sort++;
        this.velocitat++;
        this.pex = 0;
    }
    
    public int getPexSiguienteNivel(){
        switch(this.niv){
            case 1:
                return 100;
            case 2:
                return 200;
            case 3:
                return 500;
            case 4:
                return 1000;
            case 5:
                return 2000;
            default:
                return Integer.MAX_VALUE;
        }
    }
    public double getForca() {
        return forca;
    }

    public double getConstitucio() {
        return constitucio;
    }

    public double getVelocitat() {
        return velocitat;
    }

    public double getIntelligencia() {
        return intelligencia;
    }

    public double getSort() {
        return sort;
    }

    public double getPs() {
        return ps;
    }

    public double getPd() {
        return pd;
    }

    public double getPe() {
        return pe;
    }

    public double getPa() {
        return pa;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
