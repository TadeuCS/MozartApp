/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Motorista;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class MotoristaDAO extends Conexao {

    public void salvar(Motorista user) {
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    public void remover(Motorista motorista) {
        em.getTransaction().begin();
        em.remove(motorista);
        em.getTransaction().commit();
    }

    public Motorista buscar(int codigo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Motorista.findByCodmotorista").setParameter("codmotorista", codigo);
        em.getTransaction().commit();
        return (Motorista) query.getSingleResult();
    }

    public List<Motorista> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Motorista.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
}
