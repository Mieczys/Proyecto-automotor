package ejercicio.consejo.Jpa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultaAutomotorResultadoController {

    @GetMapping("/consultaAutomotorResultado")
    public String mostrarResultados() {
        return "consultaAutomotorResultado";
    }
}