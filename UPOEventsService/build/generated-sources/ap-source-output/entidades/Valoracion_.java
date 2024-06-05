package entidades;

import entidades.Evento;
import entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2024-06-03T16:37:13")
@StaticMetamodel(Valoracion.class)
public class Valoracion_ { 

    public static volatile SingularAttribute<Valoracion, Integer> idValoracion;
    public static volatile SingularAttribute<Valoracion, Evento> evento;
    public static volatile SingularAttribute<Valoracion, Integer> valoracion;
    public static volatile SingularAttribute<Valoracion, Usuario> usuario;

}