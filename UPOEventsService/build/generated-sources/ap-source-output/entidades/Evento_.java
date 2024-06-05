package entidades;

import entidades.Asistente;
import entidades.Peticion;
import entidades.Usuario;
import entidades.Valoracion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2024-06-03T16:37:13")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, Date> fecha;
    public static volatile SingularAttribute<Evento, Integer> aforo;
    public static volatile SingularAttribute<Evento, String> precio;
    public static volatile CollectionAttribute<Evento, Asistente> asistenteCollection;
    public static volatile SingularAttribute<Evento, String> hora;
    public static volatile SingularAttribute<Evento, Integer> idEvento;
    public static volatile SingularAttribute<Evento, String> lugar;
    public static volatile CollectionAttribute<Evento, Valoracion> valoracionCollection;
    public static volatile CollectionAttribute<Evento, Peticion> peticionCollection;
    public static volatile SingularAttribute<Evento, Usuario> usuario;

}