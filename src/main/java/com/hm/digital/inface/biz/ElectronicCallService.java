package com.hm.digital.inface.biz;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.hm.digital.inface.entity.ElectronicCall;

public interface ElectronicCallService {

  /**
   * 查询传过来的参数数据
   *
   * @param toSpec
   * @return
   */
  List<ElectronicCall> findAll(Specification<ElectronicCall> toSpec);

  /**
   * 新增参数
   *
   * @param list
   */
  List<ElectronicCall> insertAll(List<ElectronicCall> list);
}
