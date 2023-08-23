package com.harpers.domain;

import lombok.Data;

@Data
public class Pedido {    
    private int id_pedidoLocal;
    private String nombreCliente;
    private int numeroTelefono;
    private String descripcionPedido;

    public Pedido() {
    }

    public Pedido (int id_pedidoLocal, String nombreCliente, int numeroTelefono, String descripcionPedido) {
        this.id_pedidoLocal = id_pedidoLocal;
        this.nombreCliente = nombreCliente;
        this.numeroTelefono = numeroTelefono;
        this.descripcionPedido = descripcionPedido;
    }
}