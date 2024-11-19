package com.br.MinhaAgenda.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table
public class ProfissionalModel implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDPROFISSIONAL")
    private Long id;

    @Column(name = "NMPROFISSIONAL", nullable = false)
    private String nome;

    @Column(name = "TELEFONEPROFISSIONAL")
    private String telefone;

    @Column(name = "IDVIGENTE", nullable = false)
    private Boolean vigente;

    // Getters, setters, hashCode e equals...
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfissionalModel that = (ProfissionalModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
