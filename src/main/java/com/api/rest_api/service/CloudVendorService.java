package com.api.rest_api.service;

import com.api.rest_api.model.cloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(cloudVendor cloudVendor);
    public String updateCloudVendor(cloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public cloudVendor getCloudVendor(String cloudVendorId);
    public List<cloudVendor> getAllCloudVendors();
}
