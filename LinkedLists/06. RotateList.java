import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a;
    boolean flag = true;
    LinkedList<Integer> L = new LinkedList<>();
    int rotN =0;
    System.out.println("Given linked list:");
    while(flag){
      	a = sc.nextInt();
    	if(a!=-1) {
        	L.add(a);
            System.out.print(a+" ");
        } else {
          a = sc.nextInt();
          rotN = a;
          flag = false;
        }
    }
    rotN %= L.size();
    int i= rotN;
    System.out.println("\nRotated Linked list:");
    while(i<L.size()){
       System.out.print(L.get(i)+" ");
        i++;
    }
  	i=0;
    while(i<rotN){
    	System.out.print(L.get(i)+" ");
      	i++;
    }
  }
}
