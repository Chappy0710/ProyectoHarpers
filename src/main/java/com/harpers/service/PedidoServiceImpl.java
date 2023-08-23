package com.harpers.service;
import com.harpers.domain.Pedido;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
 
    public PedidoServiceImpl() {
        listaPedidos.add(new Pedido(1, "Juan", 88888888, "Ensalada de frutas"));
        listaPedidos.add(new Pedido(2, "Pedro", 99999999, "Cheese Cake"));
    }

    @Override
    public void save(Pedido pedido) {
        var indice = -1;
        for (var a : listaPedidos) {
            indice++;
            if (Objects.equals(a.getId_pedidoLocal(), pedido.getId_pedidoLocal())) {
                listaPedidos.remove(indice);
                break;
            }
        }
        listaPedidos.add(pedido);
    }

    @Override
    public void delete(Pedido pedido) {
        int indice = -1;
        for (var a : listaPedidos) {
            indice++;
            if (Objects.equals(a.getId_pedidoLocal(), pedido.getId_pedidoLocal())) {
                listaPedidos.remove(indice);
                break;
            }
        }
    }

    @Override
    public Pedido getPedido(Pedido pedido) {
        for (var a : listaPedidos) {
            if (Objects.equals(a.getId_pedidoLocal(), pedido.getId_pedidoLocal())) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Pedido> getPedidos() {
        return listaPedidos;
    }
}
