import java.io.*;
import java.util.*;
import java.lang.*;
public class Even
{
public static void main(String ar[])
{
int num;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
num=Integer.parseInt(br.readLine());
if(num/2==2)
{
System.out.println("even");
else
System.out.println("odd");
}
}
}
