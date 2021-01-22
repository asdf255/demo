package com.example.demo.domain.dao;

import com.example.demo.domain.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Transactional //更新系のsql書くときいる
    public void insert(User user){
        final String SQL = "insert into user (user_id,user_name,email_address,password,created_at,updated_at)" +
                "values (:userId,:userName,:emailAddress,:password,NOW(3),NOW(3));";

        jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(user));
    }

}
