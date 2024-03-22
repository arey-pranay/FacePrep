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
    int i=0;
    int j = n-1;
    while(i<j){
    	if(l.get(i)!=l.get(j)){
        	System.out.print("False");
            return;
        }
      	else{
        	i++;
          	j--;
        }
    }
    System.out.print("True");
  }
}
