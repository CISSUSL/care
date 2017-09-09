package com.hrandika.spring.care.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.hrandika.spring.care.moldes.Login;

@Repository
public interface LoginRepository extends PagingAndSortingRepository<Login, Long> {

}
