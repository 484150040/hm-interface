package com.hm.digital.inface.mapper;


import org.springframework.stereotype.Repository;

import com.hm.digital.common.biz.BaseRepository;
import com.hm.digital.inface.entity.Role;

@Repository
public interface RoleMapper extends BaseRepository<Role,String> {
}
