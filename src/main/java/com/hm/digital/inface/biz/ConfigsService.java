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
   * 根据配置信息查询
   *
   * @param config
   * @return
   */
  List<Config> getValue(Config config);

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
  Config save(Config config);


}
