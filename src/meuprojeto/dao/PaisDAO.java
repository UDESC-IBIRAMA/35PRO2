/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprojeto.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.persistence.Query;
import meuprojeto.entity.Pais;
/**
 *
 * @author farah
 */
public class PaisDAO extends DAO{
    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    public static List<Pais> listar() {
        Query q = criarQuery("SELECT p FROM Pais p ORDER BY p.nome");
        List<Pais> l = q.getResultList();
        System.out.println("total: "+ l.size());
        return l;
    }
}
