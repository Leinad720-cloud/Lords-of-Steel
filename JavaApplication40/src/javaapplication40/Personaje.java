/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication40;

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
    protected int ps;
    protected int pd;
    protected int pe;
    protected int pa;
    
    //Nom
    protected String nom;
    
    public Personaje(int forca, int constitucio, 
                      int velocitat, int intelligencia, 
                      int sort,Arma arma, int pex, int niv, String nom){
        this.nom = nom;
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

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getConstitucio() {
        return constitucio;
    }

    public void setConstitucio(int constitucio) {
        this.constitucio = constitucio;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public int getIntelligencia() {
        return intelligencia;
    }

    public void setIntelligencia(int intelligencia) {
        this.intelligencia = intelligencia;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getPex() {
        return pex;
    }

    public void setPex(int pex) {
        this.pex = pex;
    }

    public int getNiv() {
        return niv;
    }

    public void setNiv(int niv) {
        this.niv = niv;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getPd() {
        return pd;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void restauraPS(){
        this.ps = (int)(this.ps * 1.10);
    }
    
    public void contratacarPA(){
        this.pa = (int)(this.pa / 2);
    }
    
    public void metodes(Dau... d){
        d[0].llencar();
        d[1].llencar();
        
    }
}
