import java.util.Scanner;
class CustomeR
{
    int customer_id;
    String name;
    int loan;
    String phone_number;
    
    Scanner sc = new Scanner(System.in);

    public CustomeR()
    {
        System.out.println("enter the customer id");
        customer_id = sc.nextInt();

        System.out.println("enter the name");
        name = sc.nextLine();

        System.out.println("enter the loan");
        loan = sc.nextInt();

        System.out.println("enter the phonre number");
        phone_number = sc.nextLine();
        
    }

    public void changeName()
        {
            String str;
            System.out.println("enter the new name");
            str = sc.nextLine();
            name = str;
        }

    public void changePhoneNumber()
        {
            String pn;
            System.out.println("enter the new phone_number");
            pn = sc.nextLine();
            phone_number = pn;
        }
}