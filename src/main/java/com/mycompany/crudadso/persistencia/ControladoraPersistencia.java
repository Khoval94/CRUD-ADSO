package com.mycompany.crudadso.persistencia;

import com.mycompany.crudadso.logica.Duenio;
import com.mycompany.crudadso.logica.Vehiculo;
import com.mycompany.crudadso.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    DuenioJpaController duenioJpa = new DuenioJpaController();
    VehiculoJpaController vehiculoJpa = new VehiculoJpaController();

    public void guardar(Duenio duenio, Vehiculo vehi) {

        //crear en la BD el dueño
        duenioJpa.create(duenio);
        //crear en la BD el vehiculo
        vehiculoJpa.create(vehi);
    }

    public List<Vehiculo> traerVehiculos() {
        return vehiculoJpa.findVehiculoEntities();
    }

    public void borrarVehiculo(int num_cliente) {
        try {
            vehiculoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Vehiculo traerVehiculo(int num_cliente) {
        return vehiculoJpa.findVehiculo(num_cliente);
    }

    public void modificarVehiculo(Vehiculo vehi) {
        try {
            vehiculoJpa.edit(vehi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
