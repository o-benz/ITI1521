public class NombreDiviseurs 
{
   public static int nombreDiviseurs (int n)
   {
        if (n<0)
        {
                System.out.println("Votre entier n’est pas positif.");
                return 0;
        }
        Integer count = 2;
        for (int i =2; i<n ; i++)
        {
                if (n%i==0)
                {
                        count+=1;
                }
        }
        return count;
   }

    public static void main(String[] args) {

       int N1=100, N2=17, N3=-3;

        /* Affichage*/
        System.out.println();
        System.out.println("Le nombre de diviseurs de " + N1
                + " est " + nombreDiviseurs(N1));
        System.out.println("Le nombre de diviseurs de " + N2
                + " est " + nombreDiviseurs(N2));
        System.out.println("Le nombre de diviseurs de " + N3
                + " est " + nombreDiviseurs(N3));

    } // end main()

} // end class NombreDiviseurss