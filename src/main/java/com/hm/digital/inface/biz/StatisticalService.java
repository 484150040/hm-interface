package com.hm.digital.inface.biz;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;

import com.hm.digital.inface.entity.Statistical;

public interface StatisticalService {

  /**
   * 批量新增综合统计数据
   *
   * @param list
   */
  void insertAll(List<Statistical> list);

  /**
   * 查询所有统计数据
   *
   * @return
   */
  List<Statistical> selectAll();

  /**
   * 查询指定数据
   *
   * @return
   */
  Page<Statistical> statisticalPage();

  /**
   * 查询传过来的参数数据
   *
   * @param toSpec
   * @return
   */
  List<Statistical> findAll(Specification<Statistical> toSpec);
}
