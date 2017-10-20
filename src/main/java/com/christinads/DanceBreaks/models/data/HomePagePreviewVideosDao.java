package com.christinads.DanceBreaks.models.data;

import com.christinads.DanceBreaks.models.HomePagePreviewVideos;
import com.christinads.DanceBreaks.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Christy on 10/19/2017.
 */
@Repository
@Transactional
//public interface UserDao extends CrudRepository<User, Integer>
public interface HomePagePreviewVideosDao extends CrudRepository<HomePagePreviewVideos, Integer>{
}
