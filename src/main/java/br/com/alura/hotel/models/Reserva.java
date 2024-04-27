package br.com.alura.hotel.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "HA_RESERVA")
public class Reserva {
    @Id
    @SequenceGenerator(name = "reserva_id_sequence", sequenceName = "reserva_id_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reserva_id_sequence")
    private Integer id;
    private Date dataEntrada;
    private Date dataSaida;
    private Integer valor;
    private String formaPagamento;

    public Integer getId() {
        return id;
    }

    public Reserva(Integer id, Date dataEntrada, Date dataSaida, Integer valor, String formaPagamento) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public Reserva() {

    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public Integer getValor() {
        return valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(id, reserva.id) && Objects.equals(dataEntrada, reserva.dataEntrada) && Objects.equals(dataSaida, reserva.dataSaida) && Objects.equals(valor, reserva.valor) && Objects.equals(formaPagamento, reserva.formaPagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataEntrada, dataSaida, valor, formaPagamento);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", valor=" + valor +
                ", formaPagamento='" + formaPagamento + '\'' +
                '}';
    }
}
