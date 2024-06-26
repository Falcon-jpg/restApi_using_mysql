package com.api.rest_api.service;

import com.api.rest_api.model.cloudVendor;
import com.api.rest_api.repository.repo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService{

    repo repository;

    public CloudVendorServiceImpl(repo repository) {
        this.repository = repository;
    }

    @Override
    public String createCloudVendor(cloudVendor cloudVendor) {
        repository.save(cloudVendor);
        return "Created";
    }

    @Override
    public String updateCloudVendor(cloudVendor cloudVendor) {
        repository.save(cloudVendor);
        return "Updated";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        repository.deleteById(cloudVendorId);
        return "Deleted";
    }

    @Override
    public cloudVendor getCloudVendor(String cloudVendorId) {
        if(repository.findById(cloudVendorId).isPresent()){
            return repository.findById(cloudVendorId).get();
        }else {
            return null;
        }
    }

    @Override
    public List<cloudVendor> getAllCloudVendors() {
        return repository.findAll();
    }
}
