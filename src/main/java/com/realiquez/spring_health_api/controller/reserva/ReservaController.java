package com.realiquez.spring_health_api.controller.reserva;

import com.realiquez.spring_health_api.model.Reserva;
import com.realiquez.spring_health_api.service.interfaces.reservas.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservaciones")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public Reserva crearReservacion(@RequestBody Reserva reserva){
        return reservaService.crearReserva(reserva);
    }

    @GetMapping("/{id}")
    public Reserva obtenerReservacionPorID(@PathVariable Long id){
        return reservaService.obtenerReservaPorId(id);
    }

    @GetMapping
    public List<Reserva> obtenerTodasLasReservaciones(){
        return reservaService.obtenerTodasLasReservas();
    }

    @PutMapping("/{id}")
    public Reserva modificarReservacion(@PathVariable Long id, @RequestBody Reserva reservacion){
        return reservaService.actualizarReserva(id, reservacion);
    }

    @DeleteMapping("/{id}")
    public String eliminarReservacion(@PathVariable Long id){
        return reservaService.eliminarReserva(id);
    }
}
