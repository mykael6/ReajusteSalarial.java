import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário do colaborador
        System.out.print("Digite o salário do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        // Determina o percentual de aumento com base no salário atual
        double percentualAumento;
        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual > 280 && salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual > 700 && salarioAtual <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        // Calcula os valores de aumento e novo salário
        double valorAumento = salarioAtual * (percentualAumento / 100);
        double novoSalario = salarioAtual + valorAumento;

        // Considera a inflação de 3.8% para calcular o aumento real
        double inflacao = 3.8;
        double valorAumentoReal = valorAumento - (novoSalario * (inflacao / 100));

        // Exibe os resultados
        System.out.println("\n--- Informações ---");
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.1f%%%n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário, após o aumento: R$ %.2f%n", novoSalario);
        System.out.printf("Valor do aumento real (descontado a inflação): R$ %.2f%n", valorAumentoReal);

        scanner.close();
    }
}