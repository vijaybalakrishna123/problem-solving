
//Write a program that gets n as input and print the reverse of the number
class Main {
    public static void main(String[] args) {
       int n =987987, rev=0;
       int x = n;
       while(n>0){
           rev=rev*10+(n%10);
           n=n/10;
       }
        System.out.println(rev);
    }
}