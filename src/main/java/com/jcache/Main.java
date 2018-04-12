package com.jcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;
import java.util.function.Consumer;

/**
 * Created by mihailkopchev on 4/11/18.
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        CachingProvider cachingProvider = Caching.getCachingProvider();
        CacheManager cacheManager = cachingProvider.getCacheManager();
        MutableConfiguration<Integer, String> mutableConfiguration = new MutableConfiguration<Integer, String>();
        Cache<Integer, String> names = cacheManager.createCache("names", mutableConfiguration);
        names.put(1, "Misho");

        names.forEach((element) -> System.out.println(element.getKey()));

        System.out.println(names.get(1));
    }
}
