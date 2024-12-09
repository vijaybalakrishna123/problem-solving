/*Write a Program that takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4

Expected output:

*

**

***

****
*/

class Main {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            
            }
            System.out.println("");
        }
        
    }
}