
package com.mylink.sdk.admin.modules.system.service.mapstruct;

import com.mylink.sdk.admin.base.BaseMapper;
import com.mylink.sdk.admin.modules.system.domain.DictDetail;
import com.mylink.sdk.admin.modules.system.service.dto.DictDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author admin
* @date 2019-04-10
*/
@Mapper(componentModel = "spring", uses = {DictSmallMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictDetailMapper extends BaseMapper<DictDetailDto, DictDetail> {

}