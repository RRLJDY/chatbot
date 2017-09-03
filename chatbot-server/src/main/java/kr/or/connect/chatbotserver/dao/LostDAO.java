package kr.or.connect.chatbotserver.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import kr.or.connect.chatbotserver.model.Lost;
import kr.or.connect.chatbotserver.sql.LostSqls;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class LostDAO {
    @PersistenceContext
    private EntityManager entityManager;


    @SuppressWarnings("unchecked")
    public List<Lost> getAllLost(){
        String hql ="";
        return (List<Lost>) entityManager.createQuery(hql).getResultList();
    }

    public int getId(String user_key){
        String hql = LostSqls.GETIDMAX;
        return (int) entityManager.createNativeQuery(hql).setParameter(1,user_key).getSingleResult();
    }

    public Lost getLost(int id){
        return entityManager.find(Lost.class,id);
    }

    public void addLost(Lost lost){
        entityManager.persist(lost);
    }

    public void setLost(Lost lost){
        entityManager.merge(lost);
    }

    public void removeLost(Lost lost){
        entityManager.remove(lost);
    }


}