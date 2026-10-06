package com.nubons.nnp.sso.abs.redis.blocking.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import jakarta.annotation.PostConstruct;

public abstract class AbstractRedisRepo<K, V> {

	@Autowired
	private RedisConnectionFactory redisConnectionFactory;

	private HashOperations<String, K, V> hashOp;

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {
		RedisTemplate<K, V> redisTemplate = new RedisTemplate<>();
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
		redisTemplate.setConnectionFactory(redisConnectionFactory);
		redisTemplate.afterPropertiesSet();
		hashOp = (HashOperations<String, K, V>) redisTemplate.opsForHash();
	}

	public HashOperations<String, K, V> repo() {
		return hashOp;
	}

}
