/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "viagem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viagem.findAll", query = "SELECT v FROM Viagem v"),
    @NamedQuery(name = "Viagem.findByCodviagem", query = "SELECT v FROM Viagem v WHERE v.codviagem = :codviagem"),
    @NamedQuery(name = "Viagem.findByDistancia", query = "SELECT v FROM Viagem v WHERE v.distancia = :distancia"),
    @NamedQuery(name = "Viagem.findByValor", query = "SELECT v FROM Viagem v WHERE v.valor = :valor")})
public class Viagem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODVIAGEM")
    private Integer codviagem;
    @Basic(optional = false)
    @Column(name = "DISTANCIA")
    private double distancia;
    @Basic(optional = false)
    @Column(name = "VALOR")
    private double valor;
    @JoinColumn(name = "CODCIDADE", referencedColumnName = "CODCIDADE")
    @ManyToOne(optional = false)
    private Cidade codcidade;

    public Viagem() {
    }

    public Viagem(Integer codviagem) {
        this.codviagem = codviagem;
    }

    public Viagem(Integer codviagem, double distancia, double valor) {
        this.codviagem = codviagem;
        this.distancia = distancia;
        this.valor = valor;
    }

    public Integer getCodviagem() {
        return codviagem;
    }

    public void setCodviagem(Integer codviagem) {
        this.codviagem = codviagem;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cidade getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(Cidade codcidade) {
        this.codcidade = codcidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codviagem != null ? codviagem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viagem)) {
            return false;
        }
        Viagem other = (Viagem) object;
        if ((this.codviagem == null && other.codviagem != null) || (this.codviagem != null && !this.codviagem.equals(other.codviagem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Viagem[ codviagem=" + codviagem + " ]";
    }
    
}
