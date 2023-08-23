/*
package com.harpers.controller;
import com.harpers.domain.PedidoLlevar;
import com.harpers.service.PedidoLlevarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller


@Slf4j
public class PedidoLlevarController {
    
    @Autowired
    private PedidoLlevarService pedidoLlevarService;

    
    @GetMapping("/pedidoLlevar/agregar/{id_pedidoLocal}")
    public String agregarPedidoLlevar(Model model,  PedidoLlevar pedidoLlevar) {
        pedidoLlevarService.save(pedidoLlevar);
        var lista=pedidoLlevarService.getPedidosLlevar();
        model.addAttribute("listaPedidos",lista);
        return "";
    }

    @GetMapping("/pedidoLlevar/listado")
    public String listado(Model model) {
        var pedidos = pedidoLlevarService.getPedidosLlevar();
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("totalPedidos",pedidos.size());
        return "/pedidoLlevar/listado";
    }
    
     @PostMapping("/pedidoLlevar/guardar")
    public String guardarPedido(PedidoLlevar pedidoLlevar, Model model) {
        pedidoLlevarService.save(pedidoLlevar);
        var pedidos = pedidoLlevarService.getPedidosLlevar();
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("totalPedidos",pedidos.size());
        return "redirect:/pedidoLlevar/listado";
    }
    
    @GetMapping("/pedidoLlevar/modificar/{id_pedidoLocal}")
    public String modificarPedido(PedidoLlevar pedidoLlevar, Model model) {
        pedidoLlevar = pedidoLlevarService.getPedido(pedidoLlevar);
        model.addAttribute("pedido",pedidoLlevar);
        return "/pedidoLlevar/modificar";
    }
 
    @GetMapping("/pedidoLlevar/eliminar/{id_pedidoLocal}")
    public String eliminarPedido(PedidoLlevar pedidoLlevar, Model model) {
        pedidoLlevarService.delete(pedidoLlevar);        
        var pedidos=pedidoLlevarService.getPedidosLlevar();
        model.addAttribute("pedidos",pedidos);
        model.addAttribute("totalPedidos",pedidos.size());
        return "redirect:/pedidoLlevar/listado";
    }
}
*/