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
@Table(name = "role_menu", schema = "role_menu")
@EntityListeners(AuditingEntityListener.class)
public class RoleMenu implements Serializable {

  /**
   * 作业编号
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String id;


  /**
   * 菜单权限id
   */
  @Column(name = "menu_id")
  private String menuId;

  /**
   * 角色id
   */
  @Column(name = "role_id")
  private String roleId;
}
