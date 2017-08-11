package com.mmall.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * 类说明：本地的缓存初始化最大是10000，
 * 如果超过最大值时则使用LRU（最少使用算法）算法进行清除
 * 有效期是12个，单位是小时
 *
 * @author: Casin
 * @Create: 2017-07-04 12:25
 * @HOME: https://qincasin.github.io/
 */

public class TokenCache {

    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);
    public static final String TOKEN_FREFIX="token_";
    //LRU算法
    private static LoadingCache<String,String> localCache = CacheBuilder.newBuilder()
            .initialCapacity(1000).maximumSize(10000).expireAfterAccess(12, TimeUnit.HOURS)
            .build(new CacheLoader<String, String>() {
                //默认的数据加载实现，当调用get取值的时候，如果key没有对应的值，就调用这个方法进行加载
                @Override
                public String load(String s) throws Exception {
                    return "null";
                }
            });
    public static void setKey(String key,String value){
        localCache.put(key,value);
    }
    public static String getKey(String key){
        String value=null;
        try {
            value=localCache.get(key);
            if("null".equals(value)){
                return null;
            }
            return value;
        }catch (Exception e){
            logger.error("locakCache get error",e);
        }
        return null;
    }

}
