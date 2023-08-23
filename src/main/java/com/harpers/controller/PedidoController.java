package com.harpers.controller;

import com.harpers.domain.Pedido;
import com.harpers.service.PedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller


@Slf4j
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    
    @GetMapping("/pedido/agregar/{id_pedidoLocal}")
    public String agregarPedido(Model model,  Pedido pedido) {
        pedidoService.save(pedido);
        var lista=pedidoService.getPedidos();
        model.addAttribute("listaPedidos",lista);
        return "";
    }

    @GetMapping("/pedido/listado")
    public String listado(Model model) {
        var pedidos = pedidoService.getPedidos();
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("totalPedidos",pedidos.size());
        return "/pedido/listado";
    }
    
     @PostMapping("/pedido/guardar")
    public String guardarPedido(Pedido pedido, Model model) {
        pedidoService.save(pedido);
        var pedidos = pedidoService.getPedidos();
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("totalPedidos",pedidos.size());
        return "redirect:/pedido/listado";
    }
    
    @GetMapping("/pedido/modificar/{id_pedidoLocal}")
    public String modificarPedido(Pedido pedido, Model model) {
        pedido = pedidoService.getPedido(pedido);
        model.addAttribute("pedido",pedido);
        return "/pedido/modificar";
    }
 
    @GetMapping("/pedido/eliminar/{id_pedidoLocal}")
    public String eliminarPedido(Pedido pedido, Model model) {
        pedidoService.delete(pedido);        
        var pedidos=pedidoService.getPedidos();
        model.addAttribute("pedidos",pedidos);
        model.addAttribute("totalPedidos",pedidos.size());
        return "redirect:/pedido/listado";
    }
}
