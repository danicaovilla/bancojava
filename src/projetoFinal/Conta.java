package projetoFinal;

public class Conta {
	
	private String cpfTitular;
	private double saldo;
	private int agencia;
	private int numero;
	private String tipo;
	
	public Conta(String cpfTitular, double saldo, int agencia, int numero, String tipo) {
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.tipo = tipo;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean transferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

