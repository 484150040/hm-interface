package com.hm.digital.inface.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "assets", schema = "assets")
@EntityListeners(AuditingEntityListener.class)
public class Assets {

    /**
     * id主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    /**
     * 金额
     */
    @Column(name = "amount")
    private BigDecimal amount;


    /**
     *  空间名称
     */
    @Column(name = "spaceName")
    private String space_name;

    /**
     *  空间id
     */
    @Column(name = "space_id")
    private String spaceId;

    /**
     *  挪用、借用、损坏等状态
     */
    @Column(name = "status")
    private String status;


    /**
     *  数量
     */
    @Column(name = "num")
    private String num;

    /**
     *  创建时间
     */
    @Column(name = "createTime")
    private Date create_time;


    /**
     *  修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;


    /**
     *  操作人
     */
    @Column(name = "operator")
    private String operator;

    /**
     *  是否使用
     */
    @Column(name = "is_use")
    private String isUse;

    /**
     *  版本号
     */
    @Column(name = "version")
    private String version;

}
