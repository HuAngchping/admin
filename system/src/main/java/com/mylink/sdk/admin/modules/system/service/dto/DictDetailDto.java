
package com.mylink.sdk.admin.modules.system.service.dto;

import lombok.Getter;
import lombok.Setter;
import com.mylink.sdk.admin.base.BaseDTO;
import java.io.Serializable;

/**
* @author admin
* @date 2019-04-10
*/
@Getter
@Setter
public class DictDetailDto extends BaseDTO implements Serializable {

    private Long id;

    private DictSmallDto dict;

    private String label;

    private String value;

    private Integer dictSort;
}