package com.shanxiut.scs.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author LiHaitao
 * @description AccessLog:访问日志实体类
 * @date 2019/3/6 15:59
 **/
@Entity
@Table(name = "scs_access_log")
@Data
public class AccessLog extends SuperEntity<AccessLog> {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 创建时间
     */
    @Column(name = "create_time_str")
    private String createTimeStr;

    @Column(name = "create_times")
    private Long createTimes;
    /**
     * 访问方法
     */
    private String method;
    /**
     * 方法参数
     */
    private String params;

    private String operation;

    private String ip;

    private String url;

    @Column(name = "request_way")
    private String requestWay;
    /**
     * 时长
     */
    private Long time;

    private String username;





}
