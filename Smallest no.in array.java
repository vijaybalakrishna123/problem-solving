
/*Write a Program to find the smallest element in the Array

Input: 

n = 5

1 3 5 7 8

Ouput Expected:

1


Example 2

Input:

n = 8

5 7 34 67 2 56 5 8

Output:2
*/

class Main {
    public static void main(String[] args) {
        int n=8;
        int a[]={5,7,34,67,2,56,5,8};
        int small=a[0];
        for(int i=0; i<n; i++){
            if(small>a[i]){
                small=a[i];
            }
        }
        
        System.out.println(small);
    }
}