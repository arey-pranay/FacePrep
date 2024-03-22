import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> l = new LinkedList<>();
    int n = sc.nextInt();
    int a;
    for(int i=0;i<n;i++){
      	a = sc.nextInt();
    	l.add(a);
    }
    for(int i=0;i<n/2;i++){
      	System.out.print(l.get(n-i-1)+" "+l.get(i)+" ");
    }
    if(n%2!=0) System.out.println(l.get(n/2));
  }
}
