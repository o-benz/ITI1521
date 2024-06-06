import java.lang.Exception;

public class Set {

    private static final String str = System.getProperty( "line.separator" );
        
    // Instance variable
    private Cashier[] set;

    // Constructor
    public Set( int nbr ) {
        if(nbr<1){
            throw new IllegalArgumentException("number must be greater than 1");
        }
        set = new Cashier[nbr];
        for (int i = 0; i < set.length; i++) {
            set[i] = new Cashier();
        }
    }
    

    // Instance methods
    public void add (Client client) {
        int index = 0;
        int asd = set[0].getQueueSize();

        for (int i = 0; i < set.length; i++) {
            if(asd > set[i].getQueueSize()){
                index = i;
                asd = set[i].getQueueSize();
            }
        }
        set[index].add(client);
         

   }

    public void servedClients( int currentTime ) {
        for (int i = 0; i < set.length; i++) {
            set[i].servedClients(currentTime);
        }
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < set.length; i++) {
            str.append("LINE " + i +"\n");
            str.append(set[i]);
            str.append("\n");
        }
        return Set.str.toString();
    }
    }
