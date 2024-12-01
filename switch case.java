import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner scan = new Scanner(System.in);
       int size= scan.nextInt();
       switch(size){
           case 28:
               System.out.println("small");
               break;
      case 30:
             System.out.println("Medium");
             break;
      case 38:
             System.out.println("Large");
          break;
          case 40:
      System.out.println("Xlarge");
      break;
      default:
      System.out.println("Invalid");
       }
    }
}