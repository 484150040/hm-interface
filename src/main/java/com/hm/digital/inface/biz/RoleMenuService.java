package com.hm.digital.inface.biz;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.hm.digital.inface.entity.RoleMenu;

public interface RoleMenuService {

  /**
   * 通过用户名查询接口信息
   *
   * @param username
   * @return
   */
  List<String> getMenuId(String username);


  /**
   * 新增角色菜单表
   *
   * @param roleMenu
   * @return
   */
  RoleMenu save(RoleMenu roleMenu);

  /**
   * 删除全部
   *
   * @param userRoles
   */
  void deleteAll(List<RoleMenu> userRoles);

  /**
   * 查询数据信息
   *
   * @param toSpec
   * @return
   */
  List<RoleMenu> select(Specification<RoleMenu> toSpec);
}
