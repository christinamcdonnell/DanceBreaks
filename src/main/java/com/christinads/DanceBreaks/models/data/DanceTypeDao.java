package com.christinads.DanceBreaks.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Christy on 3/20/2018.
 */
@Repository
@Transactional
public interface DanceTypeDao extends CrudRepository<DanceType, Integer>{
}