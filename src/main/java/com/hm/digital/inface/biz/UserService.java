package com.hm.digital.inface.biz;

import org.springframework.data.jpa.domain.Specification;

import com.hm.digital.inface.entity.User;

public interface UserService {

  /**
   * 根据id查询数据信息
   *
   * @return
   * @param userSpecification
   */
    public User getById(
        Specification<User> userSpecification);
}
