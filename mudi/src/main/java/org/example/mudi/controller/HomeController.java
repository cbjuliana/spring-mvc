package org.example.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.example.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 9");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-C%C3%A2meras-Cinza/dp/B08G1VKHKH/ref=asc_df_B08G1VKHKH/?tag=googleshopp00-20&linkCode=df0&hvadid=379792730378&hvpos=&hvnetw=g&hvrand=2884555860400205140&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001698&hvtargid=pla-966219410635&psc=1");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/51kB1ByCiNS._AC_SL1000_.jpg");
		pedido.setDescricao("Descrição do produto Xiaomi Redmi Note 9");
		
		List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}
