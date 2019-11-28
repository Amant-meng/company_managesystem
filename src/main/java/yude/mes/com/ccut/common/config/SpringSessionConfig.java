package yude.mes.com.ccut.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(prefix = "bootdo", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {

}
