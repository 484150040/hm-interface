package com.hm.digital.inface.mapper;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hm.digital.common.biz.BaseRepository;
import com.hm.digital.inface.entity.RoleMenu;

@Repository
public interface RoleMenuMapper extends BaseRepository<RoleMenu,String> {

  /**
   * 根据用户名查询菜单数据
   *
   * @param username
   * @return
   */
  @Query(value = "SELECT c.menu_id from `user` a join user_role b on a.id = b.user_id  join role_menu c on b.role_id = c.role_id  where a.username = ?1 ", nativeQuery = true)
  List<String> getMenuId(String username);
}
