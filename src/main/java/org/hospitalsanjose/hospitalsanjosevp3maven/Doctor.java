/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hospitalsanjose.hospitalsanjosevp3maven;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Migueli Ramos
 */
@Entity
@Table(name = "doctor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d")
    , @NamedQuery(name = "Doctor.findById", query = "SELECT d FROM Doctor d WHERE d.id = :id")
    , @NamedQuery(name = "Doctor.findByNombre", query = "SELECT d FROM Doctor d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Doctor.findByApellido1", query = "SELECT d FROM Doctor d WHERE d.apellido1 = :apellido1")
    , @NamedQuery(name = "Doctor.findByApellido2", query = "SELECT d FROM Doctor d WHERE d.apellido2 = :apellido2")
    , @NamedQuery(name = "Doctor.findByAiosTrabajados", query = "SELECT d FROM Doctor d WHERE d.aiosTrabajados = :aiosTrabajados")})
public class Doctor implements Serializable {

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
    @Column(name = "AiosTrabajados")
    private int aiosTrabajados;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctorID")
    private Collection<Citamedica> citamedicaCollection;

    public Doctor() {
    }

    public Doctor(Integer id) {
        this.id = id;
    }

    public Doctor(Integer id, int aiosTrabajados) {
        this.id = id;
        this.aiosTrabajados = aiosTrabajados;
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

    public int getAiosTrabajados() {
        return aiosTrabajados;
    }

    public void setAiosTrabajados(int aiosTrabajados) {
        this.aiosTrabajados = aiosTrabajados;
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
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.hospitalsanjose.hospitalsanjosevp3maven.Doctor[ id=" + id + " ]";
    }
    
}
