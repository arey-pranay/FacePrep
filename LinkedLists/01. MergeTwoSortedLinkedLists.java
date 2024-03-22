  import java.util.*;

  class Main {
      public static void main(String args[]) {
          // Try out your code here
          Scanner sc = new Scanner(System.in);
          int n1 = sc.nextInt();
          LinkedList<Integer> l1 = new LinkedList<>();
          int a;
          for (int i = 0; i < n1; i++) {
              a = sc.nextInt();
              l1.add(a);
          }
          int n2 = sc.nextInt();
          LinkedList<Integer> l2 = new LinkedList<>();
          for (int i = 0; i < n2; i++) {
              a = sc.nextInt();
              l2.add(a);
          }

          LinkedList<Integer> l3 = new LinkedList<>();
          int i = 0;
          int j = 0;

          // Edge case: If both lists are empty, then the merged list is also empty
          if (n1 == 0 && n2 == 0) {
              System.out.println("NULL");
              return;
          }

          while (i < n1 && j < n2) {
              if (l1.get(i) < l2.get(j)) {
                  l3.add(l1.get(i));
                  i++;
              } else {
                  l3.add(l2.get(j));
                  j++;
              }
          }

          // If elements are remaining in l1, add them to l3
          while (i < n1) {
              l3.add(l1.get(i));
              i++;
          }

          // If elements are remaining in l2, add them to l3
          while (j < n2) {
              l3.add(l2.get(j));
              j++;
          }

          // Print the merged list
          System.out.print(l3.get(0));
          for (int i2 = 1; i2 < l3.size(); i2++) {
              System.out.print("->" + l3.get(i2));
          }
          System.out.print("->NULL");
      }
  }
