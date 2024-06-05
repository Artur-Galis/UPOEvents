package entidades;

import entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2024-06-03T16:37:13")
@StaticMetamodel(Bloqueo.class)
public class Bloqueo_ { 

    public static volatile SingularAttribute<Bloqueo, Usuario> bloqueador;
    public static volatile SingularAttribute<Bloqueo, Integer> idBloqueo;
    public static volatile SingularAttribute<Bloqueo, Usuario> bloqueado;

}