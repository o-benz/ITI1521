import java.lang.Math;
public class De 
{
   private int value;

   public De() 
   {
     this.value=(int)((Math.random()*6)+1);
   }

   public void lancer() 
   {
      value=(int)((Math.random()*6)+1);
   }             

   public int getValue() 
   {
      return value;
   }    

   public void setValue( int val ) 
   {
      if (val>6)
      {
         System.out.println("Valeur iIllégale du De "+val);
      }
      value=val;
   }
        
   public static void main(String[] args) 
   {
      De de1;
      de1 = new De();  
      De de2;  
      de2 = new De();
      Integer lances=0;

      while (de1.getValue()==de2.getValue())
      {
         de1.lancer();
         de2.lancer();
      }
      
      while (de1.getValue()!=de2.getValue())
      {
         de1.lancer();
         de2.lancer();
         lances+=1;
      }
           
      System.out.println("Ça a pris "+lances+" lancés pour que les deux Des indiquent la même valeur :");
          
      System.out.println(de1.getValue());
      System.out.println(de2.getValue());
      System.out.println();

      System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
      System.out.println("lorsqu'il essaie de fixer la valeur d'un De à 100. ");
      De de;  
      de = new De();  
      de.setValue(100);
      
   }
}
