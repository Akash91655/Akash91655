import java.util.Scanner;
public class project2 {
    
    public static void main(String[] args) {
        //mini project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber =0;

        do 
        {
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber)
            {
            System.out.println("woohoo11 Correct number");
            break;
            }
            else if(userNumber > myNumber)
                {
                    System.out.println("Youir Number is too large");
                }
                else
                {
                    System.out.println("Your number is too Small");
                }
            }while(userNumber >= 0);
          
        System.out.println("my number was: ");
        System.out.println(myNumber); 

    }
}
