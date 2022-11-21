package com.hm.digital.twin.biz;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.hm.digital.twin.entity.ElectronicCall;
import com.hm.digital.twin.entity.Statistical;

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
