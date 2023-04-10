package com.hm.digital.inface.biz;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.hm.digital.inface.entity.UserRole;

public interface UserRoleService {

  /**
   * 新增数据
   *
   * @param userRole
   * @return
   */
  UserRole save(UserRole userRole);

  /**
   * 查询角色信息
   *
   * @param toSpec
   * @return
   */
  List<UserRole> select(Specification<UserRole> toSpec);


  /**
   * 批量删除角色信息
   *
   * @param userRoles
   */
  void deleteAll(List<UserRole> userRoles);
}
