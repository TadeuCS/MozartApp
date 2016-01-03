/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Validade;
import Util.Classes.Conexao;

/**
 *
 * @author Tadeu
 */
public class ValidadeDAO extends Conexao {

    public Validade getValidade() {
        em.getTransaction().begin();
        query = em.createQuery("SELECT v FROM Validade v");
        em.getTransaction().commit();
        return (Validade) query.getSingleResult();
    }

    public void altera(Validade validade) {
        em.getTransaction().begin();
        em.merge(validade);
        em.getTransaction().commit();
    }
}
