package com.hm.digital.inface.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "space", schema = "space")
@EntityListeners(AuditingEntityListener.class)
public class Space {

    /**
     * id主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    /**
     *  名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 大小
     */
    @Column(name = "size")
    private String size;

    /**
     *  类型
     */
    @Column(name = "type")
    private String type;

    /**
     *  标签
     */
    @Column(name = "label")
    private String label;

    /**
     *  品牌
     */
    @Column(name = "brand")
    private String brand;

    /**
     *  状态
     */
    @Column(name = "status")
    private String status;

    /**
     *  是否使用
     */
    @Column(name = "is_use")
    private String isUse;

    /**
     *  创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     *  修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     *  是否损坏
     */
    @Column(name = "is_damage")
    private String isDamage;

    /**
     *  操作人
     */
    @Column(name = "operator")
    private String operator;

    /**
     *  版本号
     */
    @Column(name = "version")
    private String version;
}
