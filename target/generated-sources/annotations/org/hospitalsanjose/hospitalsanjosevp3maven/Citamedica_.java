package org.hospitalsanjose.hospitalsanjosevp3maven;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Citamedica.class)
public abstract class Citamedica_ {

	public static volatile SingularAttribute<Citamedica, Date> fecha;
	public static volatile SingularAttribute<Citamedica, Doctor> doctorID;
	public static volatile SingularAttribute<Citamedica, Date> hora;
	public static volatile SingularAttribute<Citamedica, Integer> id;
	public static volatile SingularAttribute<Citamedica, Paciente> pacienteID;

}

