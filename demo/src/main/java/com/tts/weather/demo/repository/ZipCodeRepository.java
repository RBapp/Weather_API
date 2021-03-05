package com.tts.weather.demo.repository;

import com.tts.weather.demo.model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode,Long> {



}
