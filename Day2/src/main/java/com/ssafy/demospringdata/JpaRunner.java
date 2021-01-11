package com.ssafy.demospringdata;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /**
         * 쿼리(JPQL)
         */
//        TypedQuery<Post> query = entityManager.createQuery("SELECT p FROM Post AS p", Post.class);
//        List<Post> posts = query.getResultList();
//        posts.forEach(System.out::println);

        /**
         * Named 쿼리도 있다.=> all_post 라는 이름이 쿼리를 Post 객체 위에 Annotation 으로 만들어줬다.
         */
//        TypedQuery<Post> query = entityManager.createNamedQuery("all_post", Post.class);
//        List<Post> posts = query.getResultList();

        /**
         * 쿼리(Criteria) TypeSafe 하다 문자열이 안들어가잖아
         */
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Post> query = builder.createQuery(Post.class);
//        Root<Post> root = query.from(Post.class);
//        query.select(root);
//
//        List<Post> posts = entityManager.createQuery(query).getResultList();
//        posts.forEach(System.out::println);

        /**
         * Native Query 를 할 수 도 있다.
         */
//        List<Post> posts = entityManager.createNativeQuery("SELECT * FROM Post", Post.class).getResultList();
//        posts.forEach(System.out::println);

        // Transient 상태
//        Account account = new Account();
//        account.setUsername("WangTak2");
//        account.setPassword("hibernate");
//
//        Study study = new Study();
//        study.setName("Spring Data JPA");
        // Transient 상태

        /**
         * 얘는 Optional 이야. 그러나 객체 지향적으로 봤을 때는 꼭 해줘야해
         * 그래서 얘네 둘은 세트야
         */
//        account.addStudy(study);

//        Post post = new Post();
//        post.setTitle("Spring Data JPA 언제 보나...");
//
//        Comment comment = new Comment();
//        comment.setComment("빨리 보고 싶어요.");
//        post.addComment(comment);
//
//        Comment comment1 = new Comment();
//        comment1.setComment("곧 보여드릴께요.");
//        post.addComment(comment1);
//
//        Session session = entityManager.unwrap(Session.class);
//        session.save(post);

//        Post post = session.get(Post.class, 1L);
//        System.out.println("------------------------");
//        System.out.println(post.getTitle());
//
//        post.getComments().forEach(c -> {
//            System.out.println("==============");
//            System.out.println(c.getComment());
//        });

//        session.save(account); // 이렇게 저장을 하면 JPA 가 아는거지 So, Persistent 상태가 됨
//        session.save(study); // 그렇다고 save 를 했다고 해서 바로 DB로 저장되는 것은 아니야

//        Account wangtak = session.load(Account.class, account.getId()); // 이러면 select 를 하지 않아 DB를 안거침
        // 여기서 왜 wangtak 을 특정 지을 수 있느냐 위의 파라미터인 account.getId() 를 통해 select where 를 거친거임
        // 근데 사실상 jpa 쪽에서는 거친 것은 아님
//        wangtak.setUsername("dahamLeee");
//        System.out.println("=====================");
//        System.out.println(wangtak.getUsername());
        /*
            or
            entityManager.persist(account);
         */
    }
}
