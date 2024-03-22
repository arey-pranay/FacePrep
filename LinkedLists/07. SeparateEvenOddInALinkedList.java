import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a;
    boolean odd = true; 
    ArrayList<Integer> even = new ArrayList<>();
    for(int i=0;i<n;i++){
    	a = sc.nextInt();
      	if(odd){
          System.out.print(a+" ");
          odd = false;
        } else {
        	even.add(a);
            odd = true;
        }
    }
    for(int i=0;i<even.size()-1;i++){
    	System.out.print(even.get(i)+" ");
    }
    System.out.print(even.get(even.size()-1));
  }
}
