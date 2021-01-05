package com.ssafy.demospringdata;

import javax.persistence.*;
import java.util.Date;


// 이 클래스가 데이터베이스에 있는 Account 테이블과 맵핑이 되는 것이라 알려주는거지
@Entity
public class Account {
    // Id 애노테이션은 릴레이션의 주키에 맵핑되는 녀석이고
    // GeneratedValue 이 값은 자동으로 생성되는 값이라 말해주고
    @Id @GeneratedValue
    private Long id;

    private String username;

    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();
    // LocalTime 은 커스텀을 할 수 있대.. 그건 난이도 높음

    private String yes;

    @Transient
    private String no;

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
}
