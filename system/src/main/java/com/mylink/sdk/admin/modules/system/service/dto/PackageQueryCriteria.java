
package com.mylink.sdk.admin.modules.system.service.dto;

import com.mylink.sdk.admin.annotation.Query;
import lombok.Data;

/**
 * @author admin
 * @date 2019-03-25
 */
@Data
public class PackageQueryCriteria {

    @Query(propName = "manufacturer_id")
    private Long manufacturerId;

    @Query
    private String platform;

}