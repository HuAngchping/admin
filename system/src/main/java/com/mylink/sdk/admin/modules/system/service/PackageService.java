package com.mylink.sdk.admin.modules.system.service;

import com.mylink.sdk.admin.modules.system.service.dto.PackageQueryCriteria;
import org.springframework.data.domain.Pageable;

/**
 * @author huang
 * @create 2021/1/4
 */
public interface PackageService {

    /**
     * 查询下载包
     * @param criteria 查询条件
     * @param pageable 分页
     * @return
     */
    public Object getPackages(PackageQueryCriteria criteria, Pageable pageable);
}
