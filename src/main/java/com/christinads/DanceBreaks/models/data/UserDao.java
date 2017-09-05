package com.christinads.DanceBreaks.models.data;

import com.christinads.DanceBreaks.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Christy on 9/4/2017.
 */
@Repository
@Transactional
public interface UserDao extends CrudRepository<DanceBreaks, Integer> {
}
