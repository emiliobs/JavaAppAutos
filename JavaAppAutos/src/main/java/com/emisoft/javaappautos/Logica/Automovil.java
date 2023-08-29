package com.emisoft.javaappautos.Logica;

import javax.annotation.processing.Generated;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil
{
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private int IdAuto;
    
   @Basic 
    private String modelo;
    private String marca;
    private String motor;
    private String color;
    private String patente;
    private int cantidadDePuerta;

    public Automovil()
    {
    }

    public Automovil(int IdAuto, String modelo, String marca, String motor, String color, String patente, int cantidadDePuerta)
    {
        this.IdAuto = IdAuto;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        this.cantidadDePuerta = cantidadDePuerta;
    }

    public int getCantidadDePuerta()
    {
        return cantidadDePuerta;
    }

    public void setCantidadDePuerta(int cantidadDePuerta)
    {
        this.cantidadDePuerta = cantidadDePuerta;
    }

    public int getIdAuto()
    {
        return IdAuto;
    }

    public void setIdAuto(int IdAuto)
    {
        this.IdAuto = IdAuto;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getMotor()
    {
        return motor;
    }

    public void setMotor(String motor)
    {
        this.motor = motor;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getPatente()
    {
        return patente;
    }

    public void setPatente(String patente)
    {
        this.patente = patente;
    }
    
    
    
}
