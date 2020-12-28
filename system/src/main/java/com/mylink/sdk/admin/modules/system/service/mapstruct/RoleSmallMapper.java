
package com.mylink.sdk.admin.modules.system.service.mapstruct;

import com.mylink.sdk.admin.base.BaseMapper;
import com.mylink.sdk.admin.modules.system.domain.Role;
import com.mylink.sdk.admin.modules.system.service.dto.RoleSmallDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author admin
 * @date 2019-5-23
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleSmallMapper extends BaseMapper<RoleSmallDto, Role> {

}
