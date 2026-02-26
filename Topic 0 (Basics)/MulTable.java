import java.util.Scanner;
public class MulTable{
    public static void main(String[] str){
        System.out.print(">>");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println(number*i);
        }
        in.close();
    }
}
