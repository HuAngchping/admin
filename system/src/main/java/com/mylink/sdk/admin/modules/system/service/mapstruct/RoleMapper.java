
package com.mylink.sdk.admin.modules.system.service.mapstruct;

import com.mylink.sdk.admin.base.BaseMapper;
import com.mylink.sdk.admin.modules.system.domain.Role;
import com.mylink.sdk.admin.modules.system.service.dto.RoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author admin
 * @date 2018-11-23
 */
@Mapper(componentModel = "spring", uses = {MenuMapper.class, DeptMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends BaseMapper<RoleDto, Role> {

}
