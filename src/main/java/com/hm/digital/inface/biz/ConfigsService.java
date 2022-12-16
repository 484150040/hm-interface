package com.hm.digital.inface.biz;

import java.util.List;

import com.hm.digital.inface.entity.Config;

public interface ConfigsService {
  /**
   * 根据类型、监所编号查询
   *
   * @param type
   * @param prisonId
   * @return
   */
  List<Config> getValue(String type,String prisonId);

  /**
   * 根据主键
   *
   * @param id
   * @return
   */
  Config getId(String id);

  /**
   * 更新数据
   *
   * @param config
   * @return
   */
  Config updete(Config config);
}
