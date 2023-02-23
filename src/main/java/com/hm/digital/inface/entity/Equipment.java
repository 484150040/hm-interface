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
@Table(name = "equipment", schema = "equipment")
@EntityListeners(AuditingEntityListener.class)
public class Equipment implements Serializable {
  /**
   * 作业编号
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String id;

  /**
   * 监所编号
   */
  @Column(name = "prison_id")
  private String prisonId;

  /**
   * 设备品牌
   */
  @Column(name = "brand")
  private String brand;

  /**
   * 设备名称
   */
  @Column(name = "name")
  private String name;

  /**
   * 是否有效
   */
  @Column(name = "isvalid")
  private Integer isvalid;

  /**
   * 设备code
   */
  @Column(name = "code")
  private String code;

  /**
   * 父级设备id
   */
  @Column(name = "parent_id")
  private String parentId;

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
