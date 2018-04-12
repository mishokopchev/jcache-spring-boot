package com.jcache.controller;

import com.jcache.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.cache.Cache;


/**
 * Created by mihailkopchev on 4/11/18.
 */
@RestController
@RequestMapping(value = "/customers", produces = "application/json")
public class CustomerController {

    private Cache<Integer, Customer> cache;

    public void setCache(Cache<Integer, Customer> cache) {
        this.cache = cache;
    }



}

