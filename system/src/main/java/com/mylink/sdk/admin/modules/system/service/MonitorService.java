
package com.mylink.sdk.admin.modules.system.service;

import java.util.Map;

/**
 * @author admin
 * @date 2020-05-02
 */
public interface MonitorService {

    /**
    * 查询数据分页
    * @return Map<String,Object>
    */
    Map<String,Object> getServers();
}
