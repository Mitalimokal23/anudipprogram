class Reversed {
 public static void main(String[] args) {

int num = 1234, reversed = 0;
while(num != 0)
{


int i = num % 10;
 reversed = reversed *10 +  i ;

num /= 10;
}
System.out.println("reversed  number :  " +  reversed) ;

}
}