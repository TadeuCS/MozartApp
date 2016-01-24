/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "motorista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motorista.findAll", query = "SELECT m FROM Motorista m"),
    @NamedQuery(name = "Motorista.findByCodmotorista", query = "SELECT m FROM Motorista m WHERE m.codmotorista = :codmotorista"),
    @NamedQuery(name = "Motorista.findByNome", query = "SELECT m FROM Motorista m WHERE m.nome = :nome"),
    @NamedQuery(name = "Motorista.findByPlaca", query = "SELECT m FROM Motorista m WHERE m.placa = :placa"),
    @NamedQuery(name = "Motorista.findByTelpessoal", query = "SELECT m FROM Motorista m WHERE m.telpessoal = :telpessoal"),
    @NamedQuery(name = "Motorista.findByTeltaxi", query = "SELECT m FROM Motorista m WHERE m.teltaxi = :teltaxi"),
    @NamedQuery(name = "Motorista.findByDatainicio", query = "SELECT m FROM Motorista m WHERE m.datainicio = :datainicio"),
    @NamedQuery(name = "Motorista.findByDatafim", query = "SELECT m FROM Motorista m WHERE m.datafim = :datafim")})
public class Motorista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODMOTORISTA")
    private Integer codmotorista;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "PLACA")
    private String placa;
    @Basic(optional = false)
    @Column(name = "TELPESSOAL")
    private String telpessoal;
    @Basic(optional = false)
    @Column(name = "TELTAXI")
    private String teltaxi;
    @Basic(optional = false)
    @Column(name = "DATAINICIO")
    @Temporal(TemporalType.DATE)
    private Date datainicio;
    @Column(name = "DATAFIM")
    @Temporal(TemporalType.DATE)
    private Date datafim;
    @OneToMany(mappedBy = "codmotorista")
    private List<Corrida> corridaList;
    @OneToMany(mappedBy = "codmotorista",cascade = CascadeType.ALL)
    private List<Endereco> enderecoList=new ArrayList<>();

    public Motorista() {
    }

    public Motorista(Integer codmotorista) {
        this.codmotorista = codmotorista;
    }

    public Motorista(Integer codmotorista, String nome, String placa, String telpessoal, String teltaxi, Date datainicio) {
        this.codmotorista = codmotorista;
        this.nome = nome;
        this.placa = placa;
        this.telpessoal = telpessoal;
        this.teltaxi = teltaxi;
        this.datainicio = datainicio;
    }

    public Integer getCodmotorista() {
        return codmotorista;
    }

    public void setCodmotorista(Integer codmotorista) {
        this.codmotorista = codmotorista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTelpessoal() {
        return telpessoal;
    }

    public void setTelpessoal(String telpessoal) {
        this.telpessoal = telpessoal;
    }

    public String getTeltaxi() {
        return teltaxi;
    }

    public void setTeltaxi(String teltaxi) {
        this.teltaxi = teltaxi;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafim() {
        return datafim;
    }

    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }

    @XmlTransient
    public List<Corrida> getCorridaList() {
        return corridaList;
    }

    public void setCorridaList(List<Corrida> corridaList) {
        this.corridaList = corridaList;
    }

    @XmlTransient
    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmotorista != null ? codmotorista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motorista)) {
            return false;
        }
        Motorista other = (Motorista) object;
        if ((this.codmotorista == null && other.codmotorista != null) || (this.codmotorista != null && !this.codmotorista.equals(other.codmotorista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Motorista[ codmotorista=" + codmotorista + " ]";
    }
    
}
