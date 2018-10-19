package module.cron.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author rumman
 * @since 10/19/18
 */
@Component(value = "basicCron")
public class BasicCronService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BasicCronService.class);

    public void execute() {
        LOGGER.debug("EXECUTING CRON JOB AT {}", new Date());
    }
}
