import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");

        String nome = myObj.nextLine();

        
    //input numerico
        System.out.println("Digite o numero da conta: ");
        int numero = myObj.nextInt();
        System.out.println("Digite o numero da agencia: "); // regex 000-0
        int agencia = myObj.nextInt();
        //saldo double
        System.out.println("Digite o saldo da conta: ");
        double saldo = myObj.nextDouble();

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");
}

}