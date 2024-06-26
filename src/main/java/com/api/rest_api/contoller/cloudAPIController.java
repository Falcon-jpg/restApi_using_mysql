package com.api.rest_api.contoller;

import com.api.rest_api.model.cloudVendor;
import com.api.rest_api.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class cloudAPIController {

    CloudVendorService cloudVendorService;

    public cloudAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public cloudVendor get1(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping
    public List<cloudVendor> getAll(){
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String create(@RequestBody cloudVendor cloudVendor1){
        cloudVendorService.createCloudVendor(cloudVendor1);
        return "Created";
    }

    @PutMapping
    public String putVendor(@RequestBody cloudVendor cloudVendor1){
        cloudVendorService.updateCloudVendor(cloudVendor1);
        return "Updated";
    }

    @DeleteMapping("{vendorId}")
    public String delete(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "deleted";
    }

}
