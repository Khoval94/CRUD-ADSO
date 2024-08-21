package com.mycompany.crudadso.logica;

import com.mycompany.crudadso.logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-21T13:48:25", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, Integer> num_cliente;
    public static volatile SingularAttribute<Vehiculo, String> licencia;
    public static volatile SingularAttribute<Vehiculo, String> color;
    public static volatile SingularAttribute<Vehiculo, String> observaciones;
    public static volatile SingularAttribute<Vehiculo, Duenio> unDuenio;
    public static volatile SingularAttribute<Vehiculo, String> limpieza;
    public static volatile SingularAttribute<Vehiculo, String> placa;

}