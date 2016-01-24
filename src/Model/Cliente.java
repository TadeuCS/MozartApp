/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodcliente", query = "SELECT c FROM Cliente c WHERE c.codcliente = :codcliente"),
    @NamedQuery(name = "Cliente.findByTelefone1", query = "SELECT c FROM Cliente c WHERE c.telefone1 = :telefone1"),
    @NamedQuery(name = "Cliente.findByTelefone2", query = "SELECT c FROM Cliente c WHERE c.telefone2 = :telefone2"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByPassageiros", query = "SELECT c FROM Cliente c WHERE c.passageiros = :passageiros")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODCLIENTE")
    private Integer codcliente;
    @Basic(optional = false)
    @Column(name = "TELEFONE1")
    private String telefone1;
    @Basic(optional = false)
    @Column(name = "TELEFONE2")
    private String telefone2;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "PASSAGEIROS")
    private int passageiros;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codcliente")
    private List<Corrida> corridaList;

    public Cliente() {
    }

    public Cliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public Cliente(Integer codcliente, String telefone1, String telefone2, String nome, int passageiros) {
        this.codcliente = codcliente;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.nome = nome;
        this.passageiros = passageiros;
    }

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    @XmlTransient
    public List<Corrida> getCorridaList() {
        return corridaList;
    }

    public void setCorridaList(List<Corrida> corridaList) {
        this.corridaList = corridaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcliente != null ? codcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codcliente == null && other.codcliente != null) || (this.codcliente != null && !this.codcliente.equals(other.codcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cliente[ codcliente=" + codcliente + " ]";
    }
    
}
