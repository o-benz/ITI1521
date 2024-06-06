/*Question5-LAB8:ITI1521*/
public class Question5{
public static void main(String [] args){
try
{
int[] array = new int[-5];
}
catch (NegativeArraySizeException  e)
{
System.out.println("Exception generated:" + e);
}

System.out.println("After the try block");
}
}
