package projetoFinal;

import projetoFinal.Conta;

public class CriarConta {
		
		public static void main(String[] args) {
			Conta primeiraConta = new Conta("04377617126", 900, 1952, 02337, "Corrente");
				System.out.println(primeiraConta.getSaldo());
				
				primeiraConta.setSaldo(100); 
				System.out.println(primeiraConta.getSaldo());
				
			Conta segundaConta = new Conta("00855612113", 500, 8129, 34895, "Poupança");
				System.out.println(segundaConta.getSaldo());
					
				segundaConta.setSaldo(500);
				System.out.println(segundaConta.getSaldo());
				
			
			Conta terceiraConta = new Conta("45499919019", 600, 5561, 18195, "Poupança");
				System.out.println(terceiraConta.getSaldo());
					
				terceiraConta.setSaldo(200);
				System.out.println(terceiraConta.getSaldo());		
		}
}