package com.pulkit.RestAPIDemo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.pulkit.RestAPIDemo.model.CloudVendor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/cloudvendor")
public class VendorAPIService {
    
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return new CloudVendor("c1","Vendor 1",
                "Address 1","xxxx");
    }

    @PostMapping
    public String creatCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping("update")
    public CloudVendor updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return cloudVendor;
    }

    @DeleteMapping
    public String deleteCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = null;
        return "Cloud Vendor Deteted Successfully";
    }

}
