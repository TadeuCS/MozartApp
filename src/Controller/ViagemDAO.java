/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Viagem;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class ViagemDAO extends Conexao {

    public void salvar(Viagem user) {
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    public void remover(Viagem motorista) {
        em.getTransaction().begin();
        em.remove(motorista);
        em.getTransaction().commit();
    }

    public Viagem buscar(int codigo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Viagem.findByCodviagem").setParameter("codviagem", codigo);
        em.getTransaction().commit();
        return (Viagem) query.getSingleResult();
    }

    public List<Viagem> listar() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Viagem.findAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
}
