class Reversed {
 public static void main(String[] args) {

int num = 1234, reversed = 0;
System.out.println("original number : " + num ) ;
// loop will execute until num becomes 0 
while(num != 0)
{
// get last digit from num 

int digit = num % 10;
 reversed = reversed*10 +  digit;
// remove last digit 
num /= 10;
}
System.out.println("reversed  number :  " +  reversed) ;

}
}