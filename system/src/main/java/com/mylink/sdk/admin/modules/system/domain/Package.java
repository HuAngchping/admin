package com.mylink.sdk.admin.modules.system.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author huang
 * @create 2021/1/4
 */
@Entity
@Getter
@Setter
@Table(name="package_info")
public class Package {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "package_name")
    private String packageName;

    @Column(name = "package_path")
    private String packagePath;

    @Column(name = "package_file_name")
    private String packageFileName;

    @Column(name = "manufacturer_id")
    private Long manufacturerId;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "platform")
    private String platform;

    @Column(name = "language")
    private String language;

    @Column(name = "version")
    private String version;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_id")
    private Long createId;

    @Column(name = "modify_id")
    private Long modifyId;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "modify_at")
    private Date modifyAt;
}
