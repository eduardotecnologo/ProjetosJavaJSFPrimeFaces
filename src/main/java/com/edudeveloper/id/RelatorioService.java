package com.edudeveloper.id;

import java.math.BigDecimal;

public class RelatorioService {
    
	private Pedidos pedidos;
    
    public RelatorioService(Pedidos pedidos) {
    	this.pedidos = pedidos;
    }
    
    public BigDecimal totalPedidosMesAtual(){
        return pedidos.totalPedidosMesAtual();
    }
}
