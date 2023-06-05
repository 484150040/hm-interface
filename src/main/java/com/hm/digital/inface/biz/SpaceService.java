package com.hm.digital.inface.biz;

import com.hm.digital.inface.entity.Assets;
import com.hm.digital.inface.entity.Space;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SpaceService {

    /**
     * 查询数据信息
     *
     * @param toSpec
     * @return
     */
    List<Space> findAll(Specification<Space> toSpec);


    /**
     * 查询该品牌该数据总数量
     *
     * @param toSpec
     * @return
     */
    Long selectNum(Specification<Space> toSpec);
}
