package com.hm.digital.inface.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MqRollCallDto  implements Serializable {
  /**
   * 点名持续时间
   */
  private Integer limitedTime;

  /**
   * 本次点名uuid
   */
  private String uuid;

  /**
   * 人员编号
   */
  private String number;

  /**
   * 点名方式
   */
  private String authenType;

  /**
   * 相似度
   */
  private String similarity;

  /**
   * 人员所在监室
   */
  private String dormCode;

  /**
   * 人员类型
   */
  private String personType;

  /**
   * 设备id
   */
  private String equipmentId;

  /**
   * 设备类型
   */
  private String equipmentType;


  /**
   * 刷卡时间
   */
  private Long alarmTime;
}
