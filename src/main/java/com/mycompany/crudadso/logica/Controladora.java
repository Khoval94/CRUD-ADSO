package com.mycompany.crudadso.logica;

import com.mycompany.crudadso.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombre, String celDuenio, String color, String placa, String licencia, String observaciones, String limpieza) {

        Duenio duenio = new Duenio();
        duenio.setCelDuenio(celDuenio);
        duenio.setNombre(nombre);

        Vehiculo vehi = new Vehiculo();
        vehi.setColor(color);
        vehi.setLicencia(licencia);
        vehi.setLimpieza(limpieza);
        vehi.setPlaca(placa);
        vehi.setObservaciones(observaciones);
        vehi.setUnDuenio(duenio);

        controlPersis.guardar(duenio, vehi);

    }

    public List<Vehiculo> traerVehiculos() {

        return controlPersis.traerVehiculos();

    }

    public void borrarVehiculo(int num_cliente) {
        controlPersis.borrarVehiculo(num_cliente);
    }

    public Vehiculo traerVehiculo(int num_cliente) {
        return controlPersis.traerVehiculo(num_cliente);
    }

    public void modificarVehiculo(Vehiculo vehi, String color, String placa, String licencia, String observaciones, String limpieza, String nombre, String celDuenio) {

        vehi.setColor(color);
        vehi.setLicencia(licencia);
        vehi.setPlaca(placa);
        vehi.setObservaciones(observaciones);
        vehi.setLimpieza(limpieza);

        controlPersis.modificarVehiculo(vehi);
        
        

        Duenio dueno = this.buscarDuenio(vehi.getUnDuenio().getId_duenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombre);
        
        this.modificarDuenio(dueno);

    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);

    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }

}
