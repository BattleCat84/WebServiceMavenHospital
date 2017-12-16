package org.hospitalsanjose.hospitalsanjosevp3maven;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Paciente.class)
public abstract class Paciente_ {

	public static volatile SingularAttribute<Paciente, String> apellido2;
	public static volatile CollectionAttribute<Paciente, Citamedica> citamedicaCollection;
	public static volatile SingularAttribute<Paciente, Date> fechaNacimiento;
	public static volatile SingularAttribute<Paciente, String> apellido1;
	public static volatile SingularAttribute<Paciente, String> calle;
	public static volatile SingularAttribute<Paciente, String> localidad;
	public static volatile SingularAttribute<Paciente, Integer> id;
	public static volatile SingularAttribute<Paciente, Integer> telefono;
	public static volatile SingularAttribute<Paciente, String> nombre;
	public static volatile SingularAttribute<Paciente, Integer> edad;

}

