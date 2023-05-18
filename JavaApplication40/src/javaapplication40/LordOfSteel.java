/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication40;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class LordOfSteel {
    static Scanner sc = new Scanner(System.in); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nan n1 = new Nan(8,6,13,16,16,new Arma("Daga"),0,1,"Tirion");
        
        System.out.println("Punts de dany n1: " + n1.getPd());
        System.out.println("Punts de salut de n1: " + n1.getPs());
        
        Huma h1 = new Huma(13,16,6,10,6,new Arma("Espasa"),0,1,"Joselu");
        
        Mitja m1 = new Mitja(9,7,7,15,16,new Arma("Martell"),0,1,"Frodo");
        
        Maia ma1 = new Maia(5,8,13,8,12,new Arma("Daga"),0,1,"Jose Juan");
        
        ArrayList<Personaje> personajes = new ArrayList<Personaje>();
        personajes.add(n1);
        personajes.add(h1);
        personajes.add(m1);
        personajes.add(ma1);
        
        /*Menu principal*/
        
        boolean seguirMenu = true;
        
        while(seguirMenu){
        System.out.println("");
        System.out.println("** MENU PRINCIPAL **");
        System.out.println("1. ELEGIR PERSONAJE");
        System.out.println("2. BORRAR PERSONAJE");
        System.out.println("3. EDITAR PERSONAJE");
        System.out.println("4. INICIAR BATALLA");
        System.out.println("5. SORTIR");
        System.out.println("");
        System.out.println("Elige una opcion [1-5]: ");
        
        String entrada = sc.nextLine();
        
        int opcion = Integer.parseInt(entrada);
        
        switch(opcion){
            case 1:
                elegirPersonaje(personajes);
                break;
            case 2:
                borrarPersonaje(personajes, nom);
                break;
            case 3:
                editarPersonaje(personaje);
                break;
            case 4: 
                iniciarCombate(personajes);
                break;
            case 5:
                seguirMenu = false;
                break;
            default:
                System.out.println("Opcion no valida. Intentalo de nuevo.");
        }
        
    }
 }
    
    private static Personaje elegirPersonaje(ArrayList<Personaje> personajes){
        System.out.println("Elige un personaje: ");
        for(int i = 0; i< personajes.size();++i){
            System.out.println(i + 1 + " ." + personajes.get(i).getNom());
        }
        
        int opcion = sc.nextInt();
        while(opcion < 1 || opcion > personajes.size()){
            System.out.println("Opcion Invalida. Intentelo de nuevo.");
            opcion = sc.nextInt();
        }
        return personajes.get(opcion - 1);
    }
    
    public static void borrarPersonaje(ArrayList<Personaje> personajes, String nom){
        for(int i = 0; i < personajes.size();++i){
            if(personajes.get(i).getNom().equals(nom)){
                personajes.remove(i);
                System.out.println("El personaje " + nom + " ha sido eliminado.");
            }
            System.out.println("El personaje " + nom + " no se encuentra en la lista.");
        }
    }
    private void editarPersonaje(Personaje personaje){
         System.out.println("¿Qué información deseas editar?");
    System.out.println("1. Nombre");
    System.out.println("2. Tipo");
    System.out.println("3. Puntos de Salud");
    System.out.println("4. Puntos de Daño");
    System.out.println("5. Arma");

    int opcion = sc.nextInt();
    sc.nextLine();

    switch (opcion) {
        case 1:
            System.out.println("Introduce el nuevo nombre: ");
            String nom = sc.nextLine();
            personaje.setNom(nom);
            break;
        case 2:
            System.out.println("Introduce los nuevos puntos de salud: ");
            int ps = sc.nextInt();
            personaje.setPs(ps);
            break;
        case 3:
            System.out.println("Introduce los nuevos puntos de daño: ");
            int pd = sc.nextInt();
            personaje.setPd(pd);
            break;
        case 4:
            System.out.println("Introduce el nombre del nuevo arma: ");
            String nombreArma = sc.nextLine();
            Arma arma = new Arma(nombreArma);
            personaje.setArma(arma);
            break;
        default:
            System.out.println("Opción inválida.");
            break;
    }

    System.out.println("El personaje ha sido actualizado:");
    System.out.println(personaje.toString());
    }
    private static void iniciarCombate(ArrayList<Personaje> personajes) {
        boolean[] seleccionats = new boolean[personajes.size()];
        Personaje[] lluitadors = new Personaje[2];
 
                
        for (int selec = 1; selec <= 2; selec++) {
            for (int i = 0; i < personajes.size(); ++i) {
                if (!seleccionats[i]) {
                    String tipus = "";
                    if (personajes.get(i) instanceof Nan)
                        tipus = "Nan";
                    else if (personajes.get(i) instanceof Huma)
                        tipus = "Huma";
                    else if (personajes.get(i) instanceof Mitja)
                        tipus = "Mitja";
                    else if (personajes.get(i) instanceof Maia)
                        tipus = "Maia";

                    System.out.printf("%d %s (%s)\n",(i+1),personajes.get(i).getNom(),
                                                     tipus);
                }            
            }
            System.out.print("\nTria un personatge " + selec + ": ");
            int opcio = sc.nextInt();
            seleccionats[opcio-1] = true;
            lluitadors[selec-1] = personajes.get(opcio-1);
            System.out.println("Personatge triat: " + 
                              personajes.get(opcio-1).getNom());        
        }
// Inici combat
        Personaje atacant  = lluitadors[0];
        Personaje defensor = lluitadors[1];
        
        
        Dau dau1 = new Dau();
        Dau dau2 = new Dau();
        Dau dau3 = new Dau();
        
        int valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
        //System.out.println("Valor daus: " + valor);
        
        if (valor <= atacant.getPa()) { // Atacant ataca
            valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
            if (valor > defensor.getPe()) { // No aconsegueix esquivar
                defensor.setPs(defensor.getPs() - atacant.getPd());
            }
        }
        
        // Final ronda
        Personaje aux = atacant;
        atacant  = defensor;
        defensor = aux;
        }
    

        
    }
