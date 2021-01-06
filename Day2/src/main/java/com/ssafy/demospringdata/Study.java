package com.ssafy.demospringdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Study {

    @Id @GeneratedValue
    private Long id;

    private String name;

    /**
     * 이 관계에서의 주인은 누구냐?
     * Study 가 주인이다. 왜냐? 반대쪽에 대한 Entity 를 Study 가 가지고 있다. 참조하고 있다.
     * 주인이라는 뜻은 무엇이냐? 그 관계를 설정했을 때 그 값이 반영이 되는 것임
     */
    @ManyToOne
    private Account owner;


    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
