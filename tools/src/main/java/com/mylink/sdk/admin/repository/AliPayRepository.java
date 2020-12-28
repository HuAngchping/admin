
package com.mylink.sdk.admin.repository;

import com.mylink.sdk.admin.domain.AlipayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author admin
 * @date 2018-12-31
 */
public interface AliPayRepository extends JpaRepository<AlipayConfig,Long> {
}
