package ifrn.pi.eventos.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class EventosController {
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";

	}
	/*@PostMapping ("/eventos")
	public String novo() {
		return "novoo";

	}*/
	/*@PostMapping ("/eventos")
	public String novoo(String nome, String local, String data, String horario){
		System.out.println(nome);
		System.out.println(local);
		System.out.println(data);
		System.out.println(horario);
		return "novoo";
		
	}
	
	
	@PostMapping ("/eventos")
	public String novoo(Evento evento){
		 
		System.out.println(evento.getNome());
		System.out.println(evento.getLocal());
		System.out.println(evento.getData());
		System.out.println(evento.getHorario());
		
		return "novoo";
		
	}*/
	
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		
		
		return "evento-adicionado";
	}
	
}


