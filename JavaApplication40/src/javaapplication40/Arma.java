/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication40;

/**
 *
 * @author danie
 */
public class Arma {
    String tipos;
    private int wpow;
    private int wvel;
    
    public Arma(String tipos){
        this.tipos = tipos;
        switch(tipos){
            case "Daga":
                this.wpow = 5;
                this.wvel = 15;
            case "Espasa":
                this.wpow  = 10;
                this.wvel  = 10;
                break;
            case "Martell":
                this.wpow  = 15;
                this.wvel  = 5;
                break; 

        }
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public void setWpow(int wpow) {
        this.wpow = wpow;
    }

    public int getWpow() {
        return wpow;
    }

    public void setWvel(int wvel) {
        this.wvel = wvel;
    }

    public int getWvel() {
        return wvel;
    }
}
