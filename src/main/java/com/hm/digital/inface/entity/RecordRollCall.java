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
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@Table(name = "record_roll_call", schema = "record_roll_call")
@EntityListeners(AuditingEntityListener.class)
public class RecordRollCall implements Serializable {
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
   * 点名次数
   */
  @Column(name = "roll_call_count")
  private String rollCallCount;

  /**
   * 应到人数
   */
  @Column(name = "number_arrivals")
  private String numberArrivals;

  /**
   * 实到人数
   */
  @Column(name = "actual_number_people")
  private String actualNumberPeople;


  /**
   * 实到进度
   */
  @Column(name = "progress")
  private String progress;

  /**
   * 监室
   */
  @Column(name = "dorm_code")
  private String dormCode;

  /**
   * 更新时间
   */
  @LastModifiedDate
  @Column(name = "modify_time")
  private Date modifyTime;


}
