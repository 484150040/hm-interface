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
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.hm.digital.inface.dto.MqRollCallDto;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

import lombok.Data;

@Data
@Entity
@Table(name = "mq_roll_call", schema = "mq_roll_call")
@TypeDef(name = "json", typeClass = JsonStringType.class)
@EntityListeners(AuditingEntityListener.class)
public class MqRollCall implements Serializable {

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
   * 命令
   */
  @Column(name = "command")
  private String order;

  /**
   * 内容
   */
  @Type(type = "json")
  @Column(name = "param",columnDefinition = "json")
  private MqRollCallDto param;

  /**
   * 点名次数
   */
  @Column(name = "count")
  private String count;

  /**
   * 创建时间
   */
  @CreatedDate
  @Column(name = "create_time")
  private Date createTime;

  /**
   * 更新时间
   */
  @LastModifiedDate
  @Column(name = "modify_time")
  private Date modifyTime;

  /**
   * 结束时间
   */
  @Column(name = "end_time")
  private Date endTime;

}
