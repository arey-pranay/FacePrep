import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<LinkedList<Integer>> A = new ArrayList<>();
    int n= sc.nextInt();
//    int[] current = new int[n];
    ArrayList<Integer> answer = new ArrayList<>();
    int temp;
    int i=0;
    int total =0;
    while(i<n){
    	LinkedList<Integer> L = new LinkedList<>();
      	boolean flag = true;
      	while(flag){
            temp = sc.nextInt();
        	if(temp==-1){
          	 	A.add(L);
              	flag=false;
        	 	i++;
        	}
            else{
				L.add(temp);
              	answer.add(temp);
              	total++;
            }
        }
    }
    //ArrayList<Integer> ans = new ArrayList<>();
    Collections.sort(answer);
    //System.out.println(answer);
    System.out.print(answer.get(0));
    for(int i2=1;i2<answer.size();i2++){
    	System.out.print(" "+answer.get(i2));
    }
  }
}
