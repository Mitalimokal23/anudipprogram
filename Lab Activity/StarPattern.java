public class StarPattern{
public static void main (String args[]){
int i , j , row = 6;  

for (i = 0;i<row; i++)
{
for (j=2*(row-i); j>=0; j--)         
{  
//prints space between two stars      
System.out.print(" ");   
}   
//inner loop for columns  
for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}   
//push  the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}