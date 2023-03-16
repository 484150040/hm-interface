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
@Table(name = "user", schema = "user")
@EntityListeners(AuditingEntityListener.class)
public class User implements Serializable {
  /**
   * 作业编号
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String id;

  /**
   * 用户名称
   */
  @Column(name = "name")
  private String name;

  /**
   * 用户名
   */
  @Column(name = "username")
  private String username;

  /**
   * 密码
   */
  @Column(name = "password")
  private String password;

  /**
   * 用户邮箱
   */
  @Column(name = "email")
  private String email;

  /**
   * 用户手机
   */
  @Column(name = "number")
  private String number;

  /**
   * 处理状态
   */
  @Column(name = "status")
  private Integer status;

  /**
   * 登录次数
   */
  @Column(name = "login_count")
  private Integer loginCount;

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

  /**
   * 最近登录时间
   */
  @LastModifiedDate
  @Column(name = "login_time")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date loginTime;
}
