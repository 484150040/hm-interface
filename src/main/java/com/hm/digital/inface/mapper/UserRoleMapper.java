package com.hm.digital.inface.mapper;


import org.springframework.stereotype.Repository;

import com.hm.digital.common.biz.BaseRepository;
import com.hm.digital.inface.entity.UserRole;

@Repository
public interface UserRoleMapper extends BaseRepository<UserRole,String> {
}
