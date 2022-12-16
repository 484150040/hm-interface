package com.hm.digital.inface.biz;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.hm.digital.inface.entity.RecordRollCall;

public interface RecordRollCallService {

  /**
   * 根据条件查询单个数据
   *
   * @param toSpec
   * @return
   */
  RecordRollCall selectOne(Specification<RecordRollCall> toSpec);

  /**
   * 修改数据
   *
   * @param recordRollCall
   * @return
   */
  RecordRollCall update(RecordRollCall recordRollCall);


  /**
   * 根据条件查询所有数据
   *
   * @param toSpec
   * @return
   */
  List<RecordRollCall> findAll(Specification<RecordRollCall> toSpec);
}
