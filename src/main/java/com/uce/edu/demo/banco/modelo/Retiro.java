package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	
	private LocalDateTime fechaRetiro;
	private String numeroCuentaRetiro;
	private BigDecimal monto;
	
	
	
	@Override
	public String toString() {
		return "Retiro [fechaRetiro = " + fechaRetiro + ", numeroCuentaRetiro = " + numeroCuentaRetiro + ", monto retiro = "
				+ monto + "]";
	}
	//get y set
	public LocalDateTime getFechaDeposito() {
		return fechaRetiro;
	}
	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}
	public String getNumeroCuentaRetiro() {
		return numeroCuentaRetiro;
	}
	public void setNumeroCuentaRetiro(String numeroCuentaRetiro) {
		this.numeroCuentaRetiro = numeroCuentaRetiro;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
	
	

}
