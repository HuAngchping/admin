
package com.mylink.sdk.admin.modules.system.service.mapstruct;

import com.mylink.sdk.admin.base.BaseMapper;
import com.mylink.sdk.admin.modules.system.domain.Menu;
import com.mylink.sdk.admin.modules.system.service.dto.MenuDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author admin
 * @date 2018-12-17
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends BaseMapper<MenuDto, Menu> {
}
