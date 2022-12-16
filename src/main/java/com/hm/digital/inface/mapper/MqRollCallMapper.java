package com.hm.digital.inface.mapper;


import org.springframework.stereotype.Repository;

import com.hm.digital.common.biz.BaseRepository;
import com.hm.digital.inface.entity.Config;
import com.hm.digital.inface.entity.MqRollCall;

@Repository
public interface MqRollCallMapper extends BaseRepository<MqRollCall,String> {
}
