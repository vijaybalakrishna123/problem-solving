/*Write a Program that takes input n and prints the below pattern 

sample
Input:

n= 6

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 

6 6 6 6 6 6 

*/
class Main {
    public static void main(String[] args) {
        int n=6;
        int count = 1;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
              
          }
        System.out.println();
          }
   }
}