package com.informatorio.recetas.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Receta receta;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unidad_id", referencedColumnName = "id")
    private UnidadDeMedida unidadDeMedida;

    private String descripcion;
    private BigDecimal cantidad;

    public Ingrediente() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Receta getReceta() {
        return receta;
    }
    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public UnidadDeMedida getUnidadDeMedida() {
        return unidadDeMedida;
    }
    public void setUnidadDeMedida(UnidadDeMedida unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
}