package com.hm.digital.inface.mapper;


import org.springframework.stereotype.Repository;

import com.hm.digital.common.biz.BaseRepository;
import com.hm.digital.inface.entity.Equipment;
import com.hm.digital.inface.entity.User;

@Repository
public interface UserMapper extends BaseRepository<User,String> {
}
