package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;

public interface LoginDao extends CrudRepository<Login,Integer> {

	Login findOneByUsernameAndPassword(String string, String string2);

}
