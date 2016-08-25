package com.zheng.springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

//http://docs.spring.io/spring-data/rest/docs/current/reference/html/
@RestResource(path="teams", rel="teams")
public interface TeamDao extends CrudRepository<Team, Long>{
 
}
