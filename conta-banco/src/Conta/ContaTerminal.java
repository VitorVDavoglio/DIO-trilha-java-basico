package Conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		int numero_conta;
		String agencia;
		String nome_cliente;
		double saldo;
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Por favor, digite o número da Agência: ");
		agencia = scanner.next();
		
		System.out.println("Agora digite o número da conta: ");
		numero_conta = scanner.nextInt();
		
		System.out.println("Digite o nome completo do cliente: ");
		nome_cliente = scanner.next();
		
		System.out.println("Digite o saldo disponível: ");
		saldo = scanner.nextDouble();
		String resultado = String.format("%.2f", saldo);
		
		System.out.println("Olá " + nome_cliente +" ,obrigado por criar uma conta em nosso banco,"
							+ " sua agência é " + agencia + " ,conta " + numero_conta + " e seu saldo "
							+ "R$"+  resultado + " já está disponível para saque.");
		
	}
	
}
