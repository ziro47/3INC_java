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
    private String[] mosse;
    private int numeroMosse; 
    private int[] dannii;
    private int numeroDanni; 


    private ArrayInt puntiPartite;
    private int punteggio;

    public Pokemon(String nome, String tipo, int livello, int puntiVita) {
        this.nome = nome;
        this.tipo = tipo;
        this.livello = livello;
        this.puntiVita = puntiVita;
        this.codicePokemon = generaCodice();
        puntiPartite = new ArrayInt(10);
        this.mosse = new String[4];
        this.numeroMosse = 0;
        this.dannii = new int[4];
        this.numeroDanni = 0;
        
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
    
    public boolean aggiuingiMossa(String mossa, int danni){
        if (numeroMosse < mosse.length) {
            mosse[numeroMosse] = mossa;
            numeroMosse++; 
            
            dannii[numeroDanni] = danni;
            numeroDanni ++;
            return true;
        }
        return false;
    }
    
    public String stampaMosse(){
        String risultato = "Mosse: ";
        for (int i = 0; i < numeroMosse; i++) {
            risultato += mosse[i] + "\n";
        }
    return risultato;}
    
    
    
    public boolean registraPartita(int punt){
        boolean controllo;
        if (punt > -1){
            puntiPartite.addElem(punt);
            controllo = true;
        } else {
        controllo = false;
        }
        return controllo;
    }
    
    public String stampaStorico(){
       return puntiPartite.stampa();
    }
    
    public int migliorPunteggio(){
        return puntiPartite.max();
    }
    
    public double mediaPunteggio(){
        return puntiPartite.media();
    }
    
    public boolean haBattutoRecord(int punteggio){
        return puntiPartite.isMax(punteggio);
    }
    
    public int partiteVinte(){
        int vincite = 0;
        for (int i = 0; i<puntiPartite.size(); i++){
            if(puntiPartite.get(i) > 50){
                vincite++;
            }
        }
    return vincite;}
    

    public String analisiPokemon(){
        String txt = "Pokemon: " + nome + "\nMiglior punteggio: " + migliorPunteggio() + "\nMedia punti: " + mediaPunteggio() + "\nNumero Vittorie: " + partiteVinte();
    return txt;}
    
    public int potenzaAttacco(int indiceMossa){
        int danni = dannii[indiceMossa];
        int potenza = livello + danni;
    return potenza;}
    
    public int calcolaPuntiPartita(int potenza){
        int punti = potenza * 2;
        return punti;
    }
    
    public int mossaForza(String mossa) {
        switch (mossa.toLowerCase()) {
            case "flash": return 50;
            case "pow": return 40;
            default: return 0;
        }
    }   
    
    
    public String combatti(Pokemon avversario, String mossa1, String mossa2) {

        int potenza1 = this.potenzaAttacco(int indiceMossa);
        int potenza2 = avversario.potenzaAttacco(int indiceMossa);
        int punti1 = this.calcolaPuntiPartita(potenza1);
        int punti2 = avversario.calcolaPuntiPartita(potenza2);

        
        
        String vincitore = "";
        if (potenza1 > potenza2) {
            punti1 += 20;
            vincitore = this.nome;
        } else if (potenza2 > potenza1) {
            punti2 += 20;
            vincitore = avversario.nome;
        } else {
            vincitore = "Pareggio";
        }


        this.registraPartita(punti1);
        avversario.registraPartita(punti2);


        String risultato = "";
        risultato += this.nome + "\n";
        risultato += "livello = " + this.livello + "\n";
        risultato += "mossa = " + mossa1 + "\n";
        risultato += "potenza = " + potenza1 + "\n";
        risultato += "punti = " + punti1 + "\n\n";

        risultato += avversario.nome + "\n";
        risultato += "livello = " + avversario.livello + "\n";
        risultato += "mossa = " + mossa2 + "\n";
        risultato += "potenza = " + potenza2 + "\n";
        risultato += "punti = " + punti2 + "\n\n";

        risultato += "Risultato: " + vincitore;

        return risultato;
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