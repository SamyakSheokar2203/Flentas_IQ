

//Name :- Samyak Sheokar
//Contact :- 8208191363
//Email :- samyaksheokar22@gmail.com
//Github :- https://github.com/SamyakSheokar2203/Flentas_IQ



import java.util.Scanner;

public class flentas_IQ {

    public static void main(String args[] ) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("input of T ");
        int T = sc.nextInt();

        sc.nextLine();

        while(T-- > 0){

            System.out.print("Input 1st line ");
            String a = sc.nextLine();

            System.out.print("Input 2nd line ");
            String b = sc.nextLine();

            String d = new StringBuffer(b).reverse().toString();

            System.out.println((b.indexOf(a) != -1 || d.indexOf(a) != -1) &&(a.length() <= b.length()) ? "YES" : "NO");

        }

    }
}
