
package com.emisoft.javaappautos.Persistencia;

import com.emisoft.javaappautos.Logica.Automovil;
import java.util.List;


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

    
    
    
    
    
}
