package dci.ufro.cl.desafio1.Controller;

import dci.ufro.cl.desafio1.Entity.Automovil;
import dci.ufro.cl.desafio1.Service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class AutomovilController {
    @Autowired
    private AutomovilService automovilService;

    @GetMapping("/automoviles/generar/{cantidad}")
    public List<Automovil> generarAutomoviles(@PathVariable int cantidad) {
        return automovilService.generateCars(cantidad);
    }
}
