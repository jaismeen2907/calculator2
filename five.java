import java.util.Scanner;
public class five {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();

        if(n%5==0){
            System.out.println("yessssss");
        }
        else{
            System.out.println("nooooo");
        }
    }
}
