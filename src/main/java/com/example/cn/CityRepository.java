package com.example.cn;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

/**
 * Created by Administrator on 12/11/2016.
 */
interface CityRepository extends Repository<City, Long> {

    Page<City> findAll(Pageable pageable);

    Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(String name,
                                                                       String country, Pageable pageable);

    City findByNameAndCountryAllIgnoringCase(String name, String country);

}