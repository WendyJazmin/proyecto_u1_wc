package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {

	private String numeroCunetaOrigen;
	private String nuemroCuentaDestino;
	private BigDecimal montoTransferir;
	private LocalDateTime fechaTransferencia;
	
	
	

	@Override
	public String toString() {
		return "Transferencia [numeroCunetaOrigen=" + numeroCunetaOrigen + ", nuemroCuentaDestino="
				+ nuemroCuentaDestino + ", montoTransferir=" + montoTransferir + ", fechaTransferencia="
				+ fechaTransferencia + "]";
	}
	//set y get
	public String getNumeroCunetaOrigen() {
		return numeroCunetaOrigen;
	}
	public void setNumeroCunetaOrigen(String numeroCunetaOrigen) {
		this.numeroCunetaOrigen = numeroCunetaOrigen;
	}
	public String getNuemroCuentaDestino() {
		return nuemroCuentaDestino;
	}
	public void setNuemroCuentaDestino(String nuemroCuentaDestino) {
		this.nuemroCuentaDestino = nuemroCuentaDestino;
	}
	public BigDecimal getMontoTransferir() {
		return montoTransferir;
	}
	public void setMontoTransferir(BigDecimal montoTransferir) {
		this.montoTransferir = montoTransferir;
	}
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	
	
	
}
