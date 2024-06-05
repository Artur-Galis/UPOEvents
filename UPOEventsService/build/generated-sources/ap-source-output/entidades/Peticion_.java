package entidades;

import entidades.Evento;
import entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2024-06-03T16:37:13")
@StaticMetamodel(Peticion.class)
public class Peticion_ { 

    public static volatile SingularAttribute<Peticion, String> estado;
    public static volatile SingularAttribute<Peticion, Evento> evento;
    public static volatile SingularAttribute<Peticion, Usuario> usuario;
    public static volatile SingularAttribute<Peticion, Integer> idPeticion;

}