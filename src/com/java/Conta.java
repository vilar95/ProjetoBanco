package com.java;

public class Conta {
	
	
	private int numero ;
	private double saldo ;
	
	public Conta () {
		
	}
	
	public Conta(int numero, double saldo){
		this.numero = numero;
		this.saldo = saldo; 
	}
	
	public double recuperarSaldo() {
	    return saldo; 
	}
	public void depostar(double valor) {
		saldo = saldo + valor;	
		}
	public void setNumero(int numero) {
		this.numero = numero;
		}
	public int getNumero() {
		return numero;
	}
	}

	

