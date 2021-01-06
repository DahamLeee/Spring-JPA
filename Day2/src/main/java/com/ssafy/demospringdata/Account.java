package com.ssafy.demospringdata;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


// 이 클래스가 데이터베이스에 있는 Account 테이블과 맵핑이 되는 것이라 알려주는거지
@Entity
public class Account {
    // Id 애노테이션은 릴레이션의 주키에 맵핑되는 녀석이고
    // GeneratedValue 이 값은 자동으로 생성되는 값이라 말해주고
    @Id @GeneratedValue
    private Long id;

    private String username;

    private String password;

    /**
     * OneToMany 인지 ManyToOne 인지 헷갈린다? 싶으면 끝 쪽을 보면 돼
     * 밑에 예시를 보면 Many 로 끝나잖아 그렇다면 Value 는 Collection 이겠지?
     * 반대 상황에서는 Study 가 주인일 때를 보면 된다.
     */
    @OneToMany(mappedBy = "owner")
    private Set<Study> studies = new HashSet<>();




    public Set<Study> getStudies() {
        return studies;
    }

    public void setStudies(Set<Study> studies) {
        this.studies = studies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Convenient Method
    public void addStudy(Study study) {
        this.getStudies().add(study); // 이쪽이 Owner side는 아니지만
        study.setOwner(this); // owner side 에서 설정이 되죠.
    }

    // Convenient Method
    public void removeStudy(Study study) {
        this.getStudies().remove(study);
        study.setOwner(null);
    }
}
