import java.util.*;
class MyQueue{
  Stack<Integer> qu = new Stack<>();
  Stack<Integer> temp = new Stack<>();
  void enqueue(int x){
  	while(!qu.isEmpty()){
    	temp.add(qu.pop());
    }
    qu.add(x);
    while(!temp.isEmpty()){
    	qu.add(temp.pop());
    }
  }
  int dequeue(){
  	return qu.pop();
  }
  boolean isEmpty(){
  	if(qu.isEmpty()){
    	return true;
    } else {
    	return false;
    }
  }
}
class Main
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
    MyQueue queue = new MyQueue();
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
    	int temp = sc.nextInt();
        queue.enqueue(temp);
    }
    n = sc.nextInt();
    for(int i=0;i<n;i++){
    	queue.dequeue();
    }
    System.out.println("Queue elements are:");
    while(!queue.isEmpty()){
    	System.out.print(queue.dequeue()+" ");
    }
  }
}
