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

}


