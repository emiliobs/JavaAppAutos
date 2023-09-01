package com.emisoft.javaappautos.Logica;

import com.emisoft.javaappautos.Persistencia.ControladoraPersistencia;
import java.util.List;
import com.emisoft.javaappautos.Logica.Usuario;

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
    
    public Automovil TraerAutomovil(int idAuto)
    {
        return controladoraPersistencia.TraerAutomovil(idAuto);
    }
    
    public void EditarAutomovil(Automovil automovil, String color, String marca,
            String modelo, String motor, int numeroPuertas, String patente)
    {
        automovil.setColor(color);
        automovil.setMarca(marca);
        automovil.setModelo(modelo);
        automovil.setMotor(motor);
        automovil.setCantidadDePuerta(numeroPuertas);
        automovil.setPatente(patente);
        
        controladoraPersistencia.EditarAutomovil(automovil);
        
    }
    
    public Usuario FindUserByEmailAndPassword(String email, String password)
    {
        List<Usuario> UserList = controladoraPersistencia.FindUserByEmailAndPassword();
        
        for (Usuario usuario : UserList)
        {
            //aqui comparando canenas de caractes y no numeros:
            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(password))
            {
               return usuario;
            }
        }
        
        return null;
        
        
    }
    
}
