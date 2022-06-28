import java.util.Scanner ;
class MarksArray{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int  n;

System.out.println("Enter the total subjects ");
n = sc.nextInt();

int arr[] = new int[n];

System.out.println("Enter the marks obtained in each sub ");
for(int i=0;i<n;i++)
{
  arr[i]=sc.nextInt();
}
int total = 0;
for(int i =0;i<n;i++)
{
 total=total+arr[i];
}

System.out.println("total marks obtained " + total);
float percentage;
percentage = (total/ (float)n);

System.out.println("total percentage : " + percentage + "%");
}
}

