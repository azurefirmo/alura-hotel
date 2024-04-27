package br.com.alura.hotel.dao;

import br.com.alura.hotel.models.Hospede;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HospedeRepository extends JpaRepository<Hospede, Integer> {
}
