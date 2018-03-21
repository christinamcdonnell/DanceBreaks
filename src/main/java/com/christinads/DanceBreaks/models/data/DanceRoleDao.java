package com.christinads.DanceBreaks.models.data;

import com.christinads.DanceBreaks.models.DanceRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

/**
 * Created by Christy on 3/20/2018.
 */
public interface DanceRoleDao extends CrudRepository<DanceRoleDao, Integer>{
}
