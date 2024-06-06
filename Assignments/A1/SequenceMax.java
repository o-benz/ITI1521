
public class SequenceMax{
public static int sequenceMax(int[] x) {
  Integer count = 1;
  Integer maxCount=1;
  Integer y = x.length-1;
  for (int i=0; i<y ;i++)
  {
    if (x[i]== x[i+1]) 
    {
      count+=1;
    }
    else
    {
      if (count>maxCount)
      {
        maxCount=count;
        count=1;
      }
    }
  }  
  if (count>maxCount) 
  {
    maxCount=count;
  }
  return maxCount;
  }

 

  public static void main(String[] args) {
   
    int[] Tab1 = {1,2,1,3,3,3,6,1,1};
    int[] Tab2 = {1,5,2,2,2,7,3,3,3,3};
    int[] Tab3 = {3,1,7,1};
    
     System.out.println("La plus longue séquence d’éléments consécutifs égaux dans Tab1 est : " + sequenceMax(Tab1));
     System.out.println("La plus longue séquence d’éléments consécutifs égaux dans Tab2 est : " + sequenceMax(Tab2));
     System.out.println("La plus longue séquence d’éléments consécutifs égaux dans Tab3 est : " + sequenceMax(Tab3));
     System.out.println();
    }

  } 

