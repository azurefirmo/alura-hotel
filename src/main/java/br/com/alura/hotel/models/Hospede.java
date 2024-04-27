package br.com.alura.hotel.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.text.ParseException;
import java.util.Objects;

@Entity
@Table(name = "HA_HOSPEDE")
public class Hospede {

    @Id
    @SequenceGenerator(name = "hospede_id_sequence", sequenceName = "hospede_id_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospede_id_sequence")
    private Integer id;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String nacionalidade;
    private String telefone;

    public Hospede(Integer id, String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
    }

    public Hospede() {

    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Date getDataNascimento() throws ParseException {
        return dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospede hospede = (Hospede) o;
        return Objects.equals(id, hospede.id) && Objects.equals(nome, hospede.nome) && Objects.equals(sobrenome, hospede.sobrenome) && Objects.equals(dataNascimento, hospede.dataNascimento) && Objects.equals(nacionalidade, hospede.nacionalidade) && Objects.equals(telefone, hospede.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, sobrenome, dataNascimento, nacionalidade, telefone);
    }

    @Override
    public String toString() {
        return "Hospede{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
