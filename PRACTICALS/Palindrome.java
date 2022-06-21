
1  Write a program to find whether a number is palindrome or not?

class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=378;// variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  