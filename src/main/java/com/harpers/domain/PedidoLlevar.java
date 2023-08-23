package com.harpers.domain;

import lombok.Data;

@Data
public class PedidoLlevar {
    private int id_pedidoLocal;
    private String nombreCliente;
    private int numeroTelefono;
    private String descripcionPedido;
    private String ubicacion;

    public PedidoLlevar() {
    }
    
    public PedidoLlevar (int id_pedidoLocal, String nombreCliente, int numeroTelefono, String descripcionPedido, String ubicacion) {
        this.id_pedidoLocal = id_pedidoLocal;
        this.nombreCliente = nombreCliente;
        this.numeroTelefono = numeroTelefono;
        this.descripcionPedido = descripcionPedido;
        this.ubicacion = ubicacion;
    }
}
