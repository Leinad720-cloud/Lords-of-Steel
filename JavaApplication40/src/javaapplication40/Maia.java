/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication40;

/**
 *
 * @author danie
 */
public class Maia extends Personaje{
    public Maia(int forca, int constitucio, 
                      int velocitat, int intelligencia, int sort, Arma arma, int pex, int niv, String nom){
        super(forca, constitucio, velocitat, intelligencia, sort, arma, pex, niv, nom);
    }
    
    @Override
    public void CalculaLasCaracteristicasDerivadas(){
        super.CalculaLasCaracteristicasDerivadas();
        pa = intelligencia + sort + arma.getWvel() + velocitat;
    }
}
