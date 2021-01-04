package com.mylink.sdk.admin.modules.system.service.impl;

import com.mylink.sdk.admin.modules.system.service.PackageService;
import com.mylink.sdk.admin.modules.system.service.dto.PackageQueryCriteria;
import org.springframework.data.domain.Pageable;

/**
 * @author huang
 * @create 2021/1/4
 */
public class PackageServiceImpl implements PackageService {

    @Override
    public Object getPackages(PackageQueryCriteria criteria, Pageable pageable) {
        return null;
    }
}
