import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do trabalhador: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.println("Digite o desconto do INSS: ");
        double descontoINSS = scanner.nextDouble();

        System.out.println("Digite o número de dependentes: ");
        int numeroDependentes = scanner.nextInt();

        System.out.println("Digite o valor do desconto para IRRF: ");
        double irrf = scanner.nextDouble();

        System.out.println("Digite o seu CPF: ");
        String cpf = scanner.next();

        System.out.println("Digite o seu CEP: ");
        String cep = scanner.next();

       
        double baseCalculo = salarioBruto - descontoINSS;
        double aliquota = 0.0; 
        double parcelaDedutivel = 0.0; 

        
        double salarioLiquido = salarioBruto - irrf;

      
        try {
            FileWriter fileWriter = new FileWriter("trabalhadores.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(nome + "," + salarioLiquido + "," + cpf + "," + cep);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Dados armazenados com sucesso!");

        scanner.close();
    }
}


      



   




