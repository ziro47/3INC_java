/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author thomas.pergol
 */
public class PRJpokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon p = new Pokemon("Gengar","dark", 47, 200);
        p.registraPartita(50);
        p.registraPartita(25);
        p.registraPartita(80);
        p.registraPartita(40);

        System.out.println(p.stampaStorico());
        /*System.out.println("Record: " + p.migliorPunteggio());
        System.out.println("Media: " + p.mediaPunti());
        System.out.println("Vittorie: " + p.partiteVinte());
        System.out.println(p.partiteVinte());*/
    }
    
}
