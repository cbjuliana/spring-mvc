package org.example.mudi.controller;

import javax.validation.Valid;

import org.example.mudi.dto.RequisicaoNovoPedido;
import org.example.mudi.model.Pedido;
import org.example.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("formulario")
	public String formulario(RequisicaoNovoPedido requisicao) {
		return "pedido/formulario";
	}

	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
		
		if (result.hasErrors()) {
			return "pedido/formulario";
		}
		
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido);
		return "redirect:/home";
	}
}