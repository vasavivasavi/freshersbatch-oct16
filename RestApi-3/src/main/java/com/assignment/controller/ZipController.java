package com.assignment.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.zip.ZipCode;

@RestController
public class ZipController {
    @RequestMapping("/add/{zipcode}")
    public ZipCode add(@PathVariable int zipcode)
    {
        HashMap<Integer,ZipCode>address=new HashMap<>();
        address.put(600096,new ZipCode("tn","chennai","India"));
        address.put(625003,new ZipCode("tn","madurai","India"));
        address.put(631027,new ZipCode("tn","cbe","India"));
        
        return address.get(zipcode);
        
        
    }



}