package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto{
	
	@Override
	public String getDescricao(){
		return "Desconto Banco";
	}
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.subtract(trintaPorCentoSobre(precoOriginal));
	}
	
	private BigDecimal trintaPorCentoSobre(BigDecimal precoOriginal){
		return precoOriginal.multiply(new BigDecimal("0.3"));
	}

	
}
