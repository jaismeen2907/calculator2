import java.util.*;
public class switchcase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();

        switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("hii");
            break;
            case 3:System.out.println("byee");
            break;
            default:System.out.println("Invalid");
        }
    }
}
