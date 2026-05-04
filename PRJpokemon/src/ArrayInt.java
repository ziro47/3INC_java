public class ArrayInt {
    private int[] arr;
    private int dimL;

    public ArrayInt(int dimF) {
        arr = new int[dimF];
        dimL = 0;
    }


    public boolean addElem(int add) {
        boolean controllo = false;
        if (dimL < arr.length) {
            arr[dimL] = add;
            dimL++;
            controllo = true;
        }
        return controllo;
    }


    public int removeElem() {
        int valore = -1;
        if (dimL > 0) {
            valore = arr[dimL - 1];
            arr[dimL - 1] = -1;
            dimL -= 1;
        }
        return valore;
    }


    public int size() {
        int n = dimL;
        return n;
    }


    public void clear() {
        int i = 0;
        while (i < arr.length) {
            arr[i] = -1;
            i += 1;
        }
        dimL = 0;
    }


    public String stampa() {
        String txt = "";
        txt += "";
        for (int i = 0; i < arr.length; i++) {
            txt += "arr[" + i + "]: " + arr[i] + "\n";
        }
        txt += "dimL: " + dimL;
        return txt;

    }

    public int[] getArr() {
        return arr;}

    public int getDimL() {
        return dimL;}

    public boolean isMax(int magg){
        boolean risultato = false;
        for(int i=0; i<arr.length; i++){
            if(magg > arr[i]){
                risultato = true;
                i++;
            }
        }
    return risultato;}
    
    
    
    public boolean isMin(int magg){
        boolean risultato = false;
        for(int i=0; i<arr.length; i++){
            if(magg < arr[i]){
                risultato = true;
                i++;
            }

        }
    return risultato;}
    
    public int max() {
        int massimo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > massimo){
            massimo = arr[i];
            }
        }
    return massimo;}

    
    public int min() {
        int minimo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimo){
                minimo = arr[i];
            }
        }      
    return minimo;}
    
    public double media() {
        int somma = 0;
        for (int i = 0; i < dimL; i++) {
            somma += arr[i];
        }
    return (double) somma / dimL;}
    
    public int get(int index) {
        if (index < 0 && index <= dimL){
            System.out.println("indice non valido" + index);
            return -1;
        }
    return arr[index];}


    public boolean inserisciOrdinato(int valore) {
        if (dimL >= arr.length) {
            return false;
        }
        
        int pos = 0;
        while (pos < dimL && arr[pos] < valore) {
            pos++;
        }
        
        for (int i = dimL; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[pos] = valore;
        dimL++;

        return true;
    }

    
    
}


