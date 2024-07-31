import java.util.Scanner; // Import the Scanner class

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        try (Scanner myObj = new Scanner(System.in)) {
    
            System.out.println("Digite o numero da Agencia: ");
            String agency = myObj.nextLine();
            
            System.out.println("Digite o numero da Conta: ");
            int numberAccount = myObj.nextInt();

            myObj.nextLine(); // Consumir a linha vazia deixada por nextInt()

            System.out.println("Digite o nome do cliente: ");
            String nameClient = myObj.nextLine();

            System.out.println("Digite o saldo da conta: ");
            float balance = myObj.nextFloat();
            

            System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %s e seu saldo %.2f ja está disponivel para saque.%n", nameClient, agency, numberAccount, balance);
        }
    }
}
