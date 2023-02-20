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


}
