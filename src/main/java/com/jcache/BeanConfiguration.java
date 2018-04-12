package com.jcache;

import com.jcache.model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;

/**
 * Created by mihailkopchev on 4/11/18.
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public CachingProvider cachingProvider() {
        return Caching.getCachingProvider();
    }

    @Bean
    public CacheManager cacheManager(CachingProvider cachingProvider) {
        return cachingProvider.getCacheManager();
    }

    @Bean
    public MutableConfiguration mutableConfiguration() {
        MutableConfiguration<Integer, Customer> mutableConfiguration = new MutableConfiguration<>();
        return mutableConfiguration;
    }

    @Bean
    public Cache<Integer, Customer> customerCache(CacheManager cacheManager, MutableConfiguration mutableConfiguration) {
        Cache<Integer, Customer> customerCache = cacheManager.createCache("customers", mutableConfiguration);
        return customerCache;
    }


}
