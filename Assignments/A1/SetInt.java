
public class SetInt {
    
    private int[] tab ;
    private int size ;
    private int nbElements ;
    private int i=0;

    public SetInt ( ) {
      size = 20;
      tab = new int[size];
      nbElements = 0;
    }
    public int getNbElements() {
        return nbElements;
    }

    public boolean has(int p,int[] tab) {
        for (int i =0 ; i<tab.length-1 ; i++) 
        {
            if (tab[i]==p) 
            {
                return true;       
            }    
        }
        return false;
    }

    public void add(int p) {
         if (has(p,tab)==false)
         {
            tab[i]=p;
            nbElements++;
            i++;
         }
    }

    public void trier()
    {
        int n = tab.length-1; 
        while (tab[n]==0)
        {
            n--;
        }
        n++;

        for (int i = 1; i < n; ++i) {
            int key = tab[i];
            int j = i - 1;
            while (j >= 0 && tab[j]>key) 
            {
                tab[j + 1] = tab[j];
                j = j - 1;
            }
            tab[j + 1] = key;
        }

    }
    
    public String toString() {
        if (nbElements == 0)
            return "{}";
        else {
            String str =  "{" + tab[0];
            for (int i = 1; i < nbElements; i++)
                str += "," + tab[i];
            return str + "}";
        }
    }

    static public void main(String[] args) {
        SetInt set = new SetInt();
        System.out.println("SVP, entrez les éléments de votre ensemble (entiers positifs) :" );
        System.out.println("Pour quitter, entrez un entier négatif:" );
        int n = ReadInt.getInt("Votre premier entier : ");
        while (n >= 0 ) {
            set.add(n);
            n = ReadInt.getInt("entier suivant : ");
        }
        
        System.out.println("Mon ensemble contient " + set.getNbElements() + " éléments : ");
        System.out.println("set = " + set);
        set.trier();
        System.out.println("Mon ensemble trié est :" );
        System.out.println("set = " + set);
     }
}
