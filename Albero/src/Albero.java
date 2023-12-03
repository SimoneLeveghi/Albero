public class Albero {

    private int valoreNodo;
    private Albero alberoDx;
    private Albero alberoSx;



    public Albero(int valoreNodo, Albero alberoDx, Albero alberoSx) {
        this.valoreNodo = valoreNodo;
        this.alberoDx = (alberoDx != null)? alberoDx.clone() : null;
        this.alberoSx = (alberoSx != null)? alberoSx.clone() : null;
    }

    private String print(int d) {
        String ret = this.valoreNodo + "\n";

        StringBuilder tabs = new StringBuilder("\t");
        tabs.append("\t".repeat(Math.max(0, d)));

        if(this.alberoDx != null) {
            ret += tabs + this.alberoDx.print(d + 1);
        }
        if(this.alberoSx != null) {
            ret += tabs + this.alberoSx.print(d + 1);
        }

        return ret;
    }

    public String print() {
        return print(0);
    }

    public int max() {
        int nodoMax = this.valoreNodo;

        if(alberoDx != null) {
            nodoMax = Math.max(nodoMax, alberoDx.max());
        }
        if(alberoSx != null) {
            nodoMax = Math.max(nodoMax, alberoSx.max());
        }

        return nodoMax;
    }


    public Albero clone() {
        return new Albero(this.valoreNodo, this.alberoDx, this.alberoSx);
    }
}
