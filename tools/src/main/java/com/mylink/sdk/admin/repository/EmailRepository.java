
package com.mylink.sdk.admin.repository;

import com.mylink.sdk.admin.domain.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author admin
 * @date 2018-12-26
 */
public interface EmailRepository extends JpaRepository<EmailConfig,Long> {
}
