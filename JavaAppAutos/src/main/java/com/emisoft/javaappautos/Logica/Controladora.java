
package com.emisoft.javaappautos.Logica;

import com.emisoft.javaappautos.Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora
{
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void AgregarAutomovil(String modelo, String marca, String motor, String color, String patente, int numeroPuertas)
    {
       Automovil automovil = new Automovil();
       
       automovil.setModelo(modelo);
       automovil.setMarca(marca);
       automovil.setMotor(motor);
       automovil.setColor(color);
       automovil.setPatente(patente);
       automovil.setCantidadDePuerta(numeroPuertas);
       
       controladoraPersistencia.AgregarAutomovil(automovil);
    }

    public List<Automovil> TrarListaAutomoviles()
    {
        return controladoraPersistencia.TrarListaAutomoviles();
    }

    public void BorrarAutoPorId(int idAuto)
    {
        controladoraPersistencia.BorrarAutoPorId(idAuto);
    }
    
    
    
    
}
