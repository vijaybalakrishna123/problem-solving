
//Write a program that gets n as input and print the number of digits in the number
class Main {
    public static void main(String[] args) {
        int n=9879, count=0;
        while (n>0){
            count=count+1;
            n=n/10;
        }
         System.out.println(count);
    }
}