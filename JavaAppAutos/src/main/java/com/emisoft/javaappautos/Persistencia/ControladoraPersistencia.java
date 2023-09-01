
package com.emisoft.javaappautos.Persistencia;

import com.emisoft.javaappautos.Logica.Automovil;
import com.emisoft.javaappautos.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia
{
    AutomovilJpaController automovilJpaController = new AutomovilJpaController();

    public void AgregarAutomovil(Automovil automovil)
    {
        automovilJpaController.create(automovil);
    }

    public List<Automovil> TrarListaAutomoviles()
    {
        return automovilJpaController.findAutomovilEntities();
    }

    public void BorrarAutoPorId(int idAuto)
    {
        try
        {
            automovilJpaController.destroy(idAuto);
        }
        catch (NonexistentEntityException ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil TraerAutomovil(int idAuto)
    {
       return automovilJpaController.findAutomovil(idAuto);
       
    }

    public void EditarAutomovil(Automovil automovil)
    {
        try
        {
            automovilJpaController.edit(automovil);
        }
        catch (Exception ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    
}
