package com.hm.digital.inface.mapper;


import org.springframework.stereotype.Repository;

import com.hm.digital.common.biz.BaseRepository;
import com.hm.digital.inface.entity.Dictionary;

@Repository
public interface DictionaryMapper extends BaseRepository<Dictionary,String> {
}
