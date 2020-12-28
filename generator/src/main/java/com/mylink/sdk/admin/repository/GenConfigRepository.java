
package com.mylink.sdk.admin.repository;

import com.mylink.sdk.admin.domain.GenConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author admin
 * @date 2019-01-14
 */
public interface GenConfigRepository extends JpaRepository<GenConfig,Long> {

    /**
     * 查询表配置
     * @param tableName 表名
     * @return /
     */
    GenConfig findByTableName(String tableName);
}
