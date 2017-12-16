/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hospitalsanjose.hospitalsanjosevp3maven;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Migueli Ramos
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
    , @NamedQuery(name = "Paciente.findById", query = "SELECT p FROM Paciente p WHERE p.id = :id")
    , @NamedQuery(name = "Paciente.findByNombre", query = "SELECT p FROM Paciente p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Paciente.findByApellido1", query = "SELECT p FROM Paciente p WHERE p.apellido1 = :apellido1")
    , @NamedQuery(name = "Paciente.findByApellido2", query = "SELECT p FROM Paciente p WHERE p.apellido2 = :apellido2")
    , @NamedQuery(name = "Paciente.findByEdad", query = "SELECT p FROM Paciente p WHERE p.edad = :edad")
    , @NamedQuery(name = "Paciente.findByFechaNacimiento", query = "SELECT p FROM Paciente p WHERE p.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Paciente.findByTelefono", query = "SELECT p FROM Paciente p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Paciente.findByCalle", query = "SELECT p FROM Paciente p WHERE p.calle = :calle")
    , @NamedQuery(name = "Paciente.findByLocalidad", query = "SELECT p FROM Paciente p WHERE p.localidad = :localidad")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 40)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 35)
    @Column(name = "Apellido1")
    private String apellido1;
    @Size(max = 35)
    @Column(name = "Apellido2")
    private String apellido2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Edad")
    private int edad;
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Telefono")
    private int telefono;
    @Size(max = 40)
    @Column(name = "Calle")
    private String calle;
    @Size(max = 40)
    @Column(name = "Localidad")
    private String localidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteID")
    private Collection<Citamedica> citamedicaCollection;

    public Paciente() {
    }

    public Paciente(Integer id) {
        this.id = id;
    }

    public Paciente(Integer id, int edad, int telefono) {
        this.id = id;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @XmlTransient
    public Collection<Citamedica> getCitamedicaCollection() {
        return citamedicaCollection;
    }

    public void setCitamedicaCollection(Collection<Citamedica> citamedicaCollection) {
        this.citamedicaCollection = citamedicaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.hospitalsanjose.hospitalsanjosevp3maven.Paciente[ id=" + id + " ]";
    }
    
}
