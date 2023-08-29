
package com.emisoft.javaappautos.Persistencia;

import com.emisoft.javaappautos.Logica.Automovil;


public class ControladoraPersistencia
{
    AutomovilJpaController automovilJpaController = new AutomovilJpaController();

    public void AgregarAutomovil(Automovil automovil)
    {
        automovilJpaController.create(automovil);
    }

    
    
    
    
    
}
