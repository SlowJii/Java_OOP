import java.util.Scanner;

public class bangCuuChuong_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 6; i <= 9; i++)
        {
            System.out.println(n + " times " + i + " is " + n*i);
        }
        sc.close();
    }
}