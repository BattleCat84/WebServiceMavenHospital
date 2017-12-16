package org.hospitalsanjose.hospitalsanjosevp3maven;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Doctor.class)
public abstract class Doctor_ {

	public static volatile SingularAttribute<Doctor, String> apellido2;
	public static volatile SingularAttribute<Doctor, Integer> aiosTrabajados;
	public static volatile CollectionAttribute<Doctor, Citamedica> citamedicaCollection;
	public static volatile SingularAttribute<Doctor, String> apellido1;
	public static volatile SingularAttribute<Doctor, Integer> id;
	public static volatile SingularAttribute<Doctor, String> nombre;

}

