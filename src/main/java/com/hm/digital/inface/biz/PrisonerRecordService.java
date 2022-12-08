package com.hm.digital.inface.biz;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.hm.digital.inface.entity.PrisonerRecord;

public interface PrisonerRecordService {

  /**
   * 批量新增综合取得参数数据
   * 
   * @param list
   */
  void insertAll(List<PrisonerRecord>list);

  /**
   * 分页查询列表
   *
   * @param toSpec
   * @param toPageable
   * @return
   */
  Page<PrisonerRecord> findAll(Specification<PrisonerRecord> toSpec, Pageable toPageable);
}
