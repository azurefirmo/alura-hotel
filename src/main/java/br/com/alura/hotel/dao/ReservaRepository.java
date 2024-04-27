package br.com.alura.hotel.dao;

import br.com.alura.hotel.models.Reserva;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
