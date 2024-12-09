/*Write a Program which takes input n and prints the below pattern


Sample 1:

Input:

n = 4

Expected output:

4321

321

21

1
*/

class Main {
    public static void main(String[] args) {
        for (int i=4;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
             System.out.println();
        }
       
    }
}