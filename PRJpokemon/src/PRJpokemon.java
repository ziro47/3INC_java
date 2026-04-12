/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author thomas.pergol
 */
public class PRJpokemon {


    public static void main(String[] args) {
        Pokemon p = new Pokemon("Gengar","dark", 47, 200);
        p.aggiuingiMossa("stronzo", 50);
        p.registraPartita(50);
        p.registraPartita(25);
        p.registraPartita(80);
        p.registraPartita(40);
        
        
        Pokemon par = new Pokemon("Charizard","fire", 20, 150);
        par.aggiuingiMossa("pow", 40);

        //System.out.println(p.stampaMosse());
        //System.out.println(p.stampaStorico());
        //System.out.println("Record: " + p.migliorPunteggio());
        //System.out.println("Media: " + p.mediaPunteggio());
        //System.out.println("Ha battuto record: " + p.haBattutoRecord(90));
        //System.out.println("Vittorie: " + p.partiteVinte());
        //System.out.println(p.analisiPokemon());
        System.out.println(p.potenzaAttacco(0));
        System.out.println(p.calcolaPuntiPartita(50));
        System.out.println(p.combatti(par, "stronzo", "pow"));
        
        
        
    }
    
}
