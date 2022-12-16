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
@Table(name = "config", schema = "config")
@EntityListeners(AuditingEntityListener.class)
public class Config  implements Serializable {
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
   * 配置类型
   */
  @Column(name = "type")
  private String type;

  /**
   * 配置名称
   */
  @Column(name = "name")
  private String name;

  /**
   * 配置数据
   */
  @Column(name = "value")
  private String value;

}
