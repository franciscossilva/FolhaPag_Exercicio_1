import java.util.Scanner;
public class folhadepagamento {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da hora de trabalho: ");
        double ValorHora = entrada.nextDouble();
        System.out.println("Digite a quantidade de horas de trabalho desse mes: ");
        int HorasTrabalhadas = entrada.nextInt();
        double salarioBruto = ValorHora * HorasTrabalhadas;
        double inss = salarioBruto * 0.10;
        double FGTS = salarioBruto * 0.11;
        double impostodeRenda;

        if (salarioBruto <= 900) {
            impostodeRenda = 0;
        } else if (salarioBruto <= 1500) {
            impostodeRenda = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            impostodeRenda = salarioBruto * 0.10;
        } else {
            impostodeRenda = salarioBruto * 0.20;
        }
        double salarioLiquido = salarioBruto - inss - impostodeRenda;
        System.out.println("\nSalario Bruto : R$ : " + salarioBruto);
        System.out.println("INSS: R$ " + inss);
        System.out.println("FGTS : RS " + FGTS);
        System.out.println("Imposto de Renda : R$ " + impostodeRenda);
        System.out.println("Salario liquido : R$ " + salarioLiquido);
    }}
