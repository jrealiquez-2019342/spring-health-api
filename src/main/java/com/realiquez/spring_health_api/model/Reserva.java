package com.realiquez.spring_health_api.model;

import java.util.Objects;

public class Reserva {

    private Long id;
    private Long usuarioId;
    private String fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva reserva)) return false;
        return Objects.equals(getId(), reserva.getId()) && Objects.equals(getUsuarioId(), reserva.getUsuarioId()) && Objects.equals(getFecha(), reserva.getFecha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsuarioId(), getFecha());
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", usuarioId=" + usuarioId +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
