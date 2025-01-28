import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word of your choice:");
        String word1 = sc.nextLine();
        System.out.println("Enter word of your choice:");
        String word2 = sc.nextLine();
    
        String temp = word1;
        word1 = word2;
        word2 = temp;
        System.out.println("The word after interchanging:" + word1);
        System.out.println("The word after interchanging:" + word2);
        sc.close();
    }
       
}
