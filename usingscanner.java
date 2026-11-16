/*
name:sammuel ubaldo
  course/year/section:BSIT NETSEC 1-1
  */ 
 
public class UsingScanner {
    public static void main(String[] args) {

       
        Scanner input = new Scanner(System.in);

       
        System.out.print("Sammuel:");
        String firstName = input.nextLine();

        System.out.print("Eugenio: ");
        String middleName = input.nextLine();

        System.out.print("Ubaldo: ");
        String lastName = input.nextLine();

       
        System.out.println("\nYour name is: " + firstName + " " + middleName + " " + lastName);

        
        input.close();
    }
}
