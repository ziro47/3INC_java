/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thomas.pergol
 */
public class Pokemon {
    private String nome;
    private String tipo;
    private int livello;
    private int puntiVita;
    private String codicePokemon;
    private int nMosse;
    private String[] mosse;
    private int nmosse;
    private ArrayInt puntiPartite;
    private int punteggio;

    public Pokemon(String nome, String tipo, int livello, int puntiVita) {
        this.nome = nome;
        this.tipo = tipo;
        this.livello = livello;
        this.puntiVita = puntiVita;
        this.codicePokemon = generaCodice();
        puntiPartite = new ArrayInt(10);
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLivello() {
        return livello;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public String getCodicePokemon() {
        return codicePokemon;
    }
   
    private String generaCodice(){
        String txt = nome.substring(0,2) + tipo.substring(tipo.length()-2, tipo.length()) + livello;
        return txt.toUpperCase();
    }
    
    public String attacca(Pokemon p){
        if(this.livello > p.livello){
            return this.nome;
        } else {
            return p.nome;
        }
    }
    
    public boolean aggiuingiMossa(String mossa){
        if (nmosse < 4){
            mosse[nMosse] = mossa;
            nMosse ++;
            return true;
        }
        return false;
    }
    
    public String stampaMosse(){
        String txt = "";
        for(int i = 0; i < nMosse; i++){
            txt += mosse[i] + "\n";
        }
        return txt;
    }
    
    public int registraPartita(int punt){
        punteggio = punteggio + punt;
        return punteggio;
    }
    
    public String stampaStorico(){
        return punteggio
    }
    
    public String stampa(){
        String txt= "";
        txt += "nome: " + nome;
        txt += "\ntipo: " + tipo;
        txt += "\nlivello: " + livello;
        txt += "\nvita: " + puntiVita;
        txt += "\ncodice: " + generaCodice();
        return txt;
    }
    

}
