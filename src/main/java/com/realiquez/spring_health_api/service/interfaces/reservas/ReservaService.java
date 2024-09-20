package com.realiquez.spring_health_api.service.interfaces.reservas;

import com.realiquez.spring_health_api.model.Reserva;

import java.util.List;

public interface ReservaService {
    Reserva crearReserva(Reserva reserva);
    Reserva obtenerReservaPorId(Long id);
    List<Reserva> obtenerTodasLasReservas();
    Reserva actualizarReserva(Long id, Reserva reserva);
    String eliminarReserva(Long id);
}
