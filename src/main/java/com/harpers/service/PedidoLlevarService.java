package com.harpers.service;

import com.harpers.domain.PedidoLlevar;
import java.util.ArrayList;
import java.util.List;


public interface PedidoLlevarService {
    
    public List<PedidoLlevar> listaPedidosLlevar=new ArrayList<>();
    
    public List<PedidoLlevar> getPedidosLlevar();
    
    public void save(PedidoLlevar pedidoLlevar);
    
    public void delete(PedidoLlevar pedidoLlevar);
    
    public PedidoLlevar getPedido(PedidoLlevar pedidoLlevar);
}
