package com.alibaba.fescar.tm.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * ${DESCRIPTION}
 *
 * @author yangyi
 */
@Configuration
@ImportResource(locations = "classpath:dubbo-business.xml")
public class BusinessConfiguration {
}
