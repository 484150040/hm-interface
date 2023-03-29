package com.hm.digital.inface.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@Table(name = "user_role", schema = "user_role")
@EntityListeners(AuditingEntityListener.class)
public class UserRole implements Serializable {

  /**
   * 作业编号
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String id;


  /**
   * 用户id
   */
  @Column(name = "user_id")
  private String userId;

  /**
   * 角色id
   */
  @Column(name = "role_id")
  private String roleId;
}
