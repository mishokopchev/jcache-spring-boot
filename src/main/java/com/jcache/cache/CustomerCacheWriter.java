package com.jcache.cache;

import com.jcache.model.Customer;

import javax.cache.Cache;
import javax.cache.integration.CacheWriter;
import javax.cache.integration.CacheWriterException;
import java.util.Collection;

/**
 * Created by mihailkopchev on 4/12/18.
 */
public class CustomerCacheWriter implements CacheWriter<Integer, Customer> {

    //private Connection to the cache object and then

    @Override
    public void write(Cache.Entry<? extends Integer, ? extends Customer> entry) throws CacheWriterException {

    }

    @Override
    public void writeAll(Collection<Cache.Entry<? extends Integer, ? extends Customer>> collection) throws CacheWriterException {

    }

    @Override
    public void delete(Object o) throws CacheWriterException {

    }

    @Override
    public void deleteAll(Collection<?> collection) throws CacheWriterException {

    }
}
