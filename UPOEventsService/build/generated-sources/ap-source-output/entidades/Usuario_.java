package entidades;

import entidades.Asistente;
import entidades.Bloqueo;
import entidades.Evento;
import entidades.Peticion;
import entidades.Reporte;
import entidades.Valoracion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2024-06-03T16:37:13")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile SingularAttribute<Usuario, Date> fechaNacimiento;
    public static volatile CollectionAttribute<Usuario, Valoracion> valoracionCollection;
    public static volatile CollectionAttribute<Usuario, Peticion> peticionCollection;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile CollectionAttribute<Usuario, Reporte> reporteCollection1;
    public static volatile CollectionAttribute<Usuario, Bloqueo> bloqueoCollection;
    public static volatile CollectionAttribute<Usuario, Asistente> asistenteCollection;
    public static volatile SingularAttribute<Usuario, String> genero;
    public static volatile CollectionAttribute<Usuario, Bloqueo> bloqueoCollection1;
    public static volatile CollectionAttribute<Usuario, Reporte> reporteCollection;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile CollectionAttribute<Usuario, Evento> eventoCollection;

}