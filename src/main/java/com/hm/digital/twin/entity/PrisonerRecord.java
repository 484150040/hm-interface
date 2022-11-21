package com.hm.digital.twin.entity;

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
@Table(name = "api_prisoner_record", schema = "api_prisoner_record")
@EntityListeners(AuditingEntityListener.class)
public class PrisonerRecord {

  @Id
  @Column(name = "id")
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String ZYID;

  /**
   * 案件类别
   */
  @Column(name = "case_type")
  public String AJLB;

  /**
   * 办案单位
   */
  @Column(name = "handling_unit")
  public String BADW;

  /**
   * 番号
   */
  @Column(name = "designation")
  public String FH;

  /**
   * 证件号码
   */
  @Column(name = "id_number")
  public String ZJHM;

  /**
   * 别名
   */
  @Column(name = "alias")
  public String BM;

  /**
   * 入所日期
   */
  @Column(name = "date_of_entry")
  public Date RSRQ;

  /**
   * 人员编号
   */
  @Column(name = "personnel_no")
  public String RYBH;

  /**
   * 监所名称
   */
  @Column(name = "name_of_prison")
  public String JSMC;

  /**
   * 籍贯
   */
  @Column(name = "native_place")
  public String JG;

  /**
   * 监室号
   */
  @Column(name = "prison_room_code")
  public String JSH;

  /**
   * 性别
   */
  @Column(name = "sex")
  public String XB;

  /**
   * 姓名
   */
  @Column(name = "name")
  public String XM;

  /**
   * 监所编号
   */
  @Column(name = "prisonId")
  public String JSBH;

  /**
   * 出生日期
   */
  @Column(name = "birth_date")
  public String CSRQ;

  /**
   * 诉讼阶段
   */
  @Column(name = "litigation_phase")
  public String SSJD;

  /**
   * 证件类型
   */
  @Column(name = "ID_type")
  public String ZJLX;

  /**
   * 关押期限
   */
  @Column(name = "length_detention")
  public Date GYQX;

  /**
   * 羁押码颜色
   */
  @Column(name = "custody_code_color")
  public String JYMYS;

  /**
   * 发现时间
   */
  @Column(name = "discovery_time")
  public String FXSJ;

  /**
   * 具体行为
   */
  @Column(name = "specific_behavior")
  public String JTXW;

  /**
   * 考核分数
   */
  @Column(name = "score")
  public String KHFS;

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
   * 是否删除
   */
  @Column(name = "deleted")
  private Integer deleted;
}
