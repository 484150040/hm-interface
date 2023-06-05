package com.hm.digital.inface.biz;

import com.hm.digital.inface.entity.Distributed;
import com.hm.digital.inface.entity.Space;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface DistributedService {

    /**
     * 新增基础信息
     *
     * @param distributed
     * @return
     */
    Distributed save(Distributed distributed);


    /**
     * 修改基础信息
     *
     * @param distributed
     * @return
     */
    Distributed saveAndFlush(Distributed distributed);


    /**
     * 查询数据信息
     *
     * @param toSpec
     * @return
     */
    List<Distributed> findAll(Specification<Distributed> toSpec);


    /**
     * 删除信息
     *
     * @param id
     */
    void remove(String id);

}
