package com.mylink.sdk.admin.modules.system.rest;

import com.mylink.sdk.admin.modules.system.service.dto.PackageQueryCriteria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huang
 * @create 2021/1/4
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "安装包下载")
@RequestMapping("/api/packages")
public class PackageDownloadController {

    @ApiOperation("返回所有下载安装包")
    @GetMapping
    public ResponseEntity packages(PackageQueryCriteria criteria, Pageable pageable) {
        return null;
    }
}
