package com.api.rest_api.repository;

import com.api.rest_api.model.cloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface repo extends JpaRepository<cloudVendor,String> {

}
