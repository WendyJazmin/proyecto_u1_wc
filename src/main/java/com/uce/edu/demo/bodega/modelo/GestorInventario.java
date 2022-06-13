package com.uce.edu.demo.bodega.modelo;

import java.math.BigDecimal;

public class GestorInventario {

	
	public static BigDecimal calcularPrecio(BigDecimal precio) {
		
		BigDecimal pc = precio;
		BigDecimal g =  pc.multiply(new BigDecimal(0.1));
		BigDecimal ivas = pc.multiply(new BigDecimal(0.2));
		
		BigDecimal pv = pc.add(g);
		BigDecimal pv2 = pv.add(ivas);
	
	
		return pv2;
	}

	
}
