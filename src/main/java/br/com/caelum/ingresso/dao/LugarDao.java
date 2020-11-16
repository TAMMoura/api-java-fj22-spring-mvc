package br.com.caelum.ingresso.dao;

import br.com.caelum.ingresso.model.Lugar;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class LugarDao {

    @PersistenceContext
    private EntityManager manager;

    public void save(Lugar lugar) {
        manager.persist(lugar);
    }
    
    public Lugar findOne(Integer id){
    	return manager.find(Lugar.class, id);
    }
}
