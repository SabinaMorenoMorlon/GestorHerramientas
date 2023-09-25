package com.MicroserviciosTFG.GestorHerramientas.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.bouncycastle.asn1.dvcs.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="herramienta")
@Getter
@Setter
@NoArgsConstructor
public class HerramientaEntity {
    @Id

    private Integer id;
    private String nombreHeramienta;
    private String tipo;
    private String marca;
    private String modelo;
    private Double precioCompra;
    private Data fechaCompra;
    private String estado;
    private String fechaBaja;
    private String ultimaLocalizacion;
    private String nombreResponsable;
}
