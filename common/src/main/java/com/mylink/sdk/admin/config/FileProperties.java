
package com.mylink.sdk.admin.config;

import lombok.Data;
import com.mylink.sdk.admin.utils.SDKAdminConstant;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author admin
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "file")
public class FileProperties {

    /** 文件大小限制 */
    private Long maxSize;

    /** 头像大小限制 */
    private Long avatarMaxSize;

    private ElPath mac;

    private ElPath linux;

    private ElPath windows;

    public ElPath getPath(){
        String os = System.getProperty("os.name");
        if(os.toLowerCase().startsWith(SDKAdminConstant.WIN)) {
            return windows;
        } else if(os.toLowerCase().startsWith(SDKAdminConstant.MAC)){
            return mac;
        }
        return linux;
    }

    @Data
    public static class ElPath{

        private String path;

        private String avatar;
    }
}
