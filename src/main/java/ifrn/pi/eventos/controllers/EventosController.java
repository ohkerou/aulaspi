package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EventosController {
	@RequestMapping("/eventos/fom")
	public String form() {
		return "formEvento";

	}
}
