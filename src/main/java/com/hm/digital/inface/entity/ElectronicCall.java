package com.hm.digital.inface.entity;

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

import lombok.Data;

@Data
@Entity
@Table(name = "api_electronic_call", schema = "api_electronic_call")
@EntityListeners(AuditingEntityListener.class)
public class ElectronicCall {

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
   * 监室号
   */
  @Column(name = "dorm_code")
  private String dormCode;

  /**
   * 监室总人数
   */
  @Column(name = "total_num")
  private int totalNum;

  /**
   * 应到人数
   */
  @Column(name = "should_num")
  private int shouldNum;

  /**
   * 实到人数
   */
  @Column(name = "called_num")
  private int calledNum;

  /**
   * 未到人数
   */
  @Column(name = "un_call_num")
  private int unCallNum;

  /**
   * 外出人数
   */
  @Column(name = "out_num")
  private int outNum;

  /**
   * 类型
   */
  @Column(name = "type")
  private String type;

  @Column(name = "uuid")
  private String uuid;

  /**
   * 发起时间
   */
  @Column(name = "rollcall_time")
  private Long rollcallTime;

  /**
   * //0 不正常 1 正常
   */
  @Column(name = "result_status")
  private String resultStatus;

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
   * 是否删除
   */
  @Column(name = "deleted")
  private Integer deleted;
}
