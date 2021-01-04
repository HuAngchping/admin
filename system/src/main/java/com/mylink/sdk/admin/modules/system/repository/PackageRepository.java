
package com.mylink.sdk.admin.modules.system.repository;

import com.mylink.sdk.admin.modules.system.domain.Package;
import com.mylink.sdk.admin.modules.system.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author admin
 * @date 2018-11-22
 */
public interface PackageRepository extends JpaRepository<Package, Long>, JpaSpecificationExecutor<Package> {


}
