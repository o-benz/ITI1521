class Tab {
public static void trier( int [ ] tab ){
  int i , j , min , tmp ; 
  for ( i = 0 ; i < tab.length - 1 ; i++) 
  {
  min = i; 
  for ( j = i + 1 ; j < tab.length ; j++) 
  { 
  if (tab[j] <tab[ min ] ) 
  { 
  min = j ; 
  }
  }
  tmp = tab[min] ; 
  tab[min] = tab[ i ] ; 
  tab [ i ] = tmp ;
  }
 }

public static int moyenne(int[] tab){
   Integer somme = 0;
  for (int i =0; i<tab.length; i++) 
  {
    somme+=tab[i];
  }
  int moyenne = somme/tab.length;
  return moyenne;
}

public static int count(int[] tab, int val){
    Integer c=0;
    for (int i=0; i<tab.length; i++)
    {
        if (tab[i]<val)
        {
            c+=1;
        }
    }
    return c;
}

public static void split(int[] tab,int[] petit, int val)
{ 
    Integer index=0;
    for (int i=0; i<tab.length;i++){
        if (tab[i]<val){
            petit[index]=tab[i];
            index+=1;
        }
    }
}

public static void main (String args [ ] )
{

int tab1 [ ] = { 3,55,7, 1, 88, 9 , 4, -10 };
int i,moyenne, size;
int[] petitTab,tab2;
tab2 = new int[]{10,34,62,56,82,7,95};
trier(tab1 ) ;
trier(tab2 ) ;
moyenne=moyenne(tab2);
size = count(tab2, moyenne); 
petitTab = new int[size];

System.out.println ("Les éléments de tab1 et tab2 triés sont : " ) ;
for ( i =0; i<tab1.length ; i++) {
/*Impression du contenu de tab1 trié*/
  if ( i >0) {
  System.out.print ( " , " ) ;
 }
 System.out.print (tab1 [ i ] ) ;
 }
System.out.println ( ) ;
for ( i =0; i<tab2.length ; i++) {
/*Impression du contenu de tab2 trié*/
  if ( i >0) {
  System.out.print ( " , " ) ;
 }
 System.out.print (tab2 [ i ] ) ;
 }
System.out.println ( ) ;
System.out.print ("La valeur moyenne de tab2 est " + moyenne(tab2)) ;
System.out.println ( ) ;
moyenne=moyenne(tab2);
split(tab2,petitTab,moyenne);
 System.out.print("Les éléments de petitTab sont : ");           
        for(i=0; i<petitTab.length; i++) {
            if (i>0) {
                System.out.print(", ");
            }
            System.out.print(petitTab[i]);           
        }
System.out.println ( ) ;
 }

}
