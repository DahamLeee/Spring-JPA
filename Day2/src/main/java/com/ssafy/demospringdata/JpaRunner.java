package com.ssafy.demospringdata;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setUsername("WangTak");
        account.setPassword("hibernate");

        Study study = new Study();
        study.setName("Spring Data JPA");

        /**
         * 얘는 Optional 이야. 그러나 객체 지향적으로 봤을 때는 꼭 해줘야해
         * 그래서 얘네 둘은 세트야
         */
        account.addStudy(study);

        Session session = entityManager.unwrap(Session.class);
        session.save(account);
        session.save(study);
        /*
            or
            entityManager.persist(account);
         */
    }
}
