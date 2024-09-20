package com.realiquez.spring_health_api.service.interfaces.reservas;

import com.realiquez.spring_health_api.model.Reserva;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReservaServiceImpl implements ReservaService{

    private Map<Long, Reserva> reservaciones = new HashMap<>();
    private Long contadorId = 1L;

    @Override
    public Reserva crearReserva(Reserva reserva) {
        reserva.setId(contadorId++);
        reservaciones.put(reserva.getId(), reserva);
        return reserva;
    }

    @Override
    public Reserva obtenerReservaPorId(Long id) {
        return reservaciones.get(id);
    }

    @Override
    public List<Reserva> obtenerTodasLasReservas() {
        return new ArrayList<>(reservaciones.values());
    }

    @Override
    public Reserva actualizarReserva(Long id, Reserva reserva) {
        if(!reservaciones.containsKey(id)) return null;
        reserva.setId(id);
        reservaciones.put(reserva.getId(), reserva);
        return reserva;
    }

    @Override
    public String eliminarReserva(Long id) {
        if (!reservaciones.containsKey(id)) return "Reservacion no existe.";
        reservaciones.remove(id);
        return "Reservacion con ID: " + id +" anulada.";
    }
}
