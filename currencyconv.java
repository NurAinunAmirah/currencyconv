import java.util.Scanner;
public class currencyconv{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Current Currency: ");
        String curTypeIn= input.nextLine();
        System.out.print("Convert Currency: ");
        String curTypeOut= input.nextLine();
        System.out.print("Input your value: ");
        Double value= input.nextDouble();
        Double valueOut=0.0;
        valueOut=value*4;
        System.out.print(valueOut+" "+ curTypeOut);





    }
}