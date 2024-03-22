import  java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> A = new LinkedList<>();
    boolean flag = true;
    int a;
    int k=0;
    while(flag){ 
      a = sc.nextInt();
      if(a!=-1) A.add(a);
      else{
        a = sc.nextInt();
      	k = a;
    	flag = false;
      }
    }
    //k %= A.size();
    int i =0;
    int j = k-1;
    while(i<A.size()-k+1){
      while(j>=i){
        System.out.println(A.get(j));
        j--;
      }
      i+=k;
      j = i+k-1;
    }  
    while(i<A.size()){
    	System.out.println(A.get(i));
      	i++;
    } 
  }
}
