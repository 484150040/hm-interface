package com.hm.digital.inface.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "distributed", schema = "distributed")
@EntityListeners(AuditingEntityListener.class)
public class Distributed {

    /**
     * id主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    /**
     * x轴
     */
    @Column(name = "x")
    private String x;


    /**
     * y轴
     */
    @Column(name = "y")
    private String y;

    /**
     * 空间id
     */
    @Column(name = "space_id")
    private String spaceId;

    /**
     * 空间名称
     */
    @Column(name = "space_name")
    private String spaceName;

    /**
     * 经度
     */
    @Column(name = "precisions")
    private String precisions;

    /**
     * 纬度
     */
    @Column(name = "latitude")
    private String latitude;

    /**
     * 位置
     */
    @Column(name = "place")
    private String place;

    /**
     * 占地面积
     */
    @Column(name = "floor_space")
    private String floorSpace;

    /**
     * 操作人
     */
    @Column(name = "operator")
    private String operator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 是否使用
     */
    @Column(name = "is_use")
    private String isUse;


    /**
     * 版本号
     */
    @Column(name = "version")
    private String version;
}
