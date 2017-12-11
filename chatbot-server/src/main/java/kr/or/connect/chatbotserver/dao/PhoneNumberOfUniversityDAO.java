package kr.or.connect.chatbotserver.dao;


import kr.or.connect.chatbotserver.model.PhoneNumberOfUniversity;
import kr.or.connect.chatbotserver.sql.PhoneNumberOfUniversitySqls;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional
@Repository
public class PhoneNumberOfUniversityDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<PhoneNumberOfUniversity> searchingPhoneNumber(String contents){
        String hql = PhoneNumberOfUniversitySqls.selectPhonNumber;
        String searching_data = "%"+contents+"%";
        List<PhoneNumberOfUniversity> result = entityManager.createQuery(hql).setParameter(1,searching_data).setParameter(2,searching_data).setParameter(3,searching_data).getResultList();
        return result;
    }

}
