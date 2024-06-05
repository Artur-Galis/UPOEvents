package entidades;

import entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2024-06-03T16:37:13")
@StaticMetamodel(Reporte.class)
public class Reporte_ { 

    public static volatile SingularAttribute<Reporte, String> categoria;
    public static volatile SingularAttribute<Reporte, String> asunto;
    public static volatile SingularAttribute<Reporte, Usuario> reportado;
    public static volatile SingularAttribute<Reporte, Integer> idReporte;
    public static volatile SingularAttribute<Reporte, Usuario> reportador;

}