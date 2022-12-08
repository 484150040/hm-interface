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
@Table(name = "api_statistical", schema = "api_statistical")
//@SQLDelete(sql = "update api_statistical set deleted = 1 where id = ?")
//@Where(clause = "deleted = 0")
@EntityListeners(AuditingEntityListener.class)
public class Statistical {

  /**
   * 作业编号
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String ZYID;

  /**
   * 总数
   */
  @Column(name = "total")
  private String total;

  /**
   * 时间
   */
  @Column(name = "date")
  private String date;

  /**
   * 名称
   */
  @Column(name = "name")
  private String NAME;

  /**
   * 请求参数
   */
  @Column(name = "required_parameter")
  private String requiredParameter;

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
   * 监所编号
   */
  @Column(name = "prison_id")
  private String prisonId;

  /**
   * 每季度年份
   */
  @Column(name = "year")
  private String year;

  /**
   * 是否删除
   */
  @Column(name = "deleted")
  private Integer deleted;
}
