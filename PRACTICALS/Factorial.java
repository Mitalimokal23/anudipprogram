write a program to print factorial number :-

public class Factorial{  

 public static void main(String args[]){  

  int i,fact=1;
  
  int number=5;//It is the number to calculate factorial   
 
  for(i=1;i<=number;i++){    

      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  



2 print the following pattern using a for loop 
1  5
2  4
3  3
4  2
5  1

public class Factorial {
    public static void main(String[] args) {
        for (int i = 1, j = 5; i < 10 && j > 0; i++, j--) {
            System.out.println( i +  "  " + j );
        }
    }
}
