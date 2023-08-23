package com.harpers.service;

import com.harpers.domain.PedidoLlevar;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;


@Service
public class PedidoLlevarServiceImpl implements PedidoLlevarService{
    
    public PedidoLlevarServiceImpl() {
        listaPedidosLlevar.add(new PedidoLlevar(2, "Pedro", 99999999, "Cheese Cake", "Cariari"));
    }
    
    @Override
    public void save(PedidoLlevar pedidoLlevar) {
        var indice = -1;
        for (var a : listaPedidosLlevar) {
            indice++;
            if (Objects.equals(a.getId_pedidoLocal(), pedidoLlevar.getId_pedidoLocal())) {
                listaPedidosLlevar.remove(indice);
                break;
            }
        }
        listaPedidosLlevar.add(pedidoLlevar);
    }

    @Override
    public void delete(PedidoLlevar pedidoLlevar) {
        int indice = -1;
        for (var a : listaPedidosLlevar) {
            indice++;
            if (Objects.equals(a.getId_pedidoLocal(), pedidoLlevar.getId_pedidoLocal())) {
                listaPedidosLlevar.remove(indice);
                break;
            }
        }
    }

    @Override
    public PedidoLlevar getPedido(PedidoLlevar pedidoLlevar) {
        for (var a : listaPedidosLlevar) {
            if (Objects.equals(a.getId_pedidoLocal(), pedidoLlevar.getId_pedidoLocal())) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<PedidoLlevar> getPedidosLlevar() {
        return listaPedidosLlevar;
    }
}
