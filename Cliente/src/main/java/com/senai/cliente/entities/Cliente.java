package com.senai.cliente.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idcCliente;

	@Column(name = "nome")
private String nomeCliente;

	@Column(name = "fone")
private String numCliente;

	public Long getidcCliente() {
		return idcCliente;
	}
	
	public String getnomeCliente() {
		return nomeCliente;
	}
	
	public String getnumCliente() {
		return numCliente;
	}
	
	public void setnomeCliente(String nomeCliente) {
	       this.nomeCliente = nomeCliente;
	   }

	   public String getFone() {
	       return numCliente;
	   }

	   public void setFone(String numCliente) {
	       this.numCliente = numCliente;
	   }
}
