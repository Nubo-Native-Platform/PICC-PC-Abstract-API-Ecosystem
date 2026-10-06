package com.nubons.nnp.sso.abs.redis.blocking.entities.sample;

import java.util.Map;

import com.nubons.nnp.sso.abs.to.SampleTO;
import org.springframework.stereotype.Repository;

import com.nubons.nnp.sso.abs.redis.blocking.core.AbstractRedisRepo;
import com.nubons.nnp.sso.abs.redis.blocking.core.RedisConstant;

@Repository
public class SampleRedisRepo extends AbstractRedisRepo<String, SampleTO>{

	public void save(SampleTO e) {
		repo().put(RedisConstant.REPO_SAMPLE, e.getId(), e);
	}

	public Map<String, SampleTO> getAll() {
		return repo().entries(RedisConstant.REPO_SAMPLE);
	}
}
