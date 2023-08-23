package com.harpers.service;


import com.harpers.domain.Pedido;
import java.util.ArrayList;
import java.util.List;

public interface PedidoService {
    
    public List<Pedido> listaPedidos=new ArrayList<>();
    
    public List<Pedido> getPedidos();
    
    public void save(Pedido pedido);
    
    public void delete(Pedido pedido);
    
    public Pedido getPedido(Pedido pedido);
    
}
