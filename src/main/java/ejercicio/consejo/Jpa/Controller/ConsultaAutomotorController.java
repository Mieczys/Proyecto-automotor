package ejercicio.consejo.Jpa.Controller;


import ejercicio.consejo.Jpa.Entity.Automovil;
import ejercicio.consejo.Jpa.Repository.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ConsultaAutomotorController {

    @Autowired
    private AutomovilRepository automovilRepository;

    @GetMapping("/consultaAutomotor")
    public String mostrarFormularioConsulta() {
        return "consultaAutomotorFormulario";
    }

    @PostMapping("/consultaAutomotor")
    public String realizarConsulta(@RequestParam("marca") String marca,
                                   @RequestParam("tipo") String tipo,
                                   Model model) {
        // Consulta a la DB utilizando AutomovilRepository
        List<Automovil> resultados = automovilRepository.findByMarcaAndTipo(marca, tipo);

        // Resultados ò mensaje para mostrar en la vista
        if (resultados.isEmpty()) {
            // No se encontraron resultados, agregar mensaje al modelo
            model.addAttribute("mensaje", "No se encontraron resultados para la marca y tipo especificados.");
        } else {
            // Resultados para mostrar en la vista
            model.addAttribute("resultados", resultados);
        }

        // Devolver la vista que va a mostrar los resultados
        return "consultaAutomotorResultado";
    }
}