
package com.mylink.sdk.admin.modules.system.service.dto;

import lombok.Data;
import com.mylink.sdk.admin.annotation.Query;

/**
 * @author admin
 * 公共查询类
 */
@Data
public class DictQueryCriteria {

    @Query(blurry = "name,description")
    private String blurry;
}
