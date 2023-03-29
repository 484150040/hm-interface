package com.hm.digital.inface.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "menu", schema = "menu")
@EntityListeners(AuditingEntityListener.class)
public class Menu implements Serializable {

  /**
   * 作业编号
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String id;


  /**
   * 菜单名称
   */
  @Column(name = "menu_name")
  private String menuName;

  /**
   * 父级菜单id
   */
  @Column(name = "menu_parent_id")
  private String menuParentId;

  /**
   * 菜单描述
   */
  @Column(name = "description")
  private String description;


  /**
   * 权限CODE
   */
  @Column(name = "authority_code")
  private String authorityCode;

  /**
   * 请求地址
   */
  @Column(name = "authority_path")
  private String authorityPath;

  /**
   * 类型platform/menu/function
   */
  @Column(name = "action")
  private String action;

  /**
   * 显示图片所在路径
   */
  @Column(name = "icon")
  private String icon;

  /**
   * 排序
   */
  @Column(name = "sort_order")
  private String sortOrder;
  /**
   * 创建时间
   */
  @CreatedDate
  @Column(name = "create_time")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;

  /**
   * 更新时间
   */
  @LastModifiedDate
  @Column(name = "modify_time")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date modifyTime;
}
