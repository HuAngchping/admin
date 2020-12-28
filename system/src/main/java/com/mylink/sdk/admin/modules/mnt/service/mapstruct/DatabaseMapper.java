
package com.mylink.sdk.admin.modules.mnt.service.mapstruct;

import com.mylink.sdk.admin.modules.mnt.service.dto.DatabaseDto;
import com.mylink.sdk.admin.base.BaseMapper;
import com.mylink.sdk.admin.modules.mnt.domain.Database;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DatabaseMapper extends BaseMapper<DatabaseDto, Database> {

}
