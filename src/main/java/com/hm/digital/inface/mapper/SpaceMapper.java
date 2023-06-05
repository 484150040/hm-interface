package com.hm.digital.inface.mapper;


import com.hm.digital.common.biz.BaseRepository;
import com.hm.digital.inface.entity.Space;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SpaceMapper extends BaseRepository<Space, String> {


    @Query(value = "select name,brand from space group by name,brand",nativeQuery = true)
    List<Map> findList();
}
