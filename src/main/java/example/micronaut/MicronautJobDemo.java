package example.micronaut;

import io.micronaut.scheduling.annotation.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.text.SimpleDateFormat;
import java.util.Date;

@Singleton
public class MicronautJobDemo {

    private static final Logger LOG = LoggerFactory.getLogger(MicronautJobDemo.class);

    @Scheduled(fixedDelay = "10s")
    void executeEveryTen() {
        LOG.info("Simple Job every 10 seconds");
    }

    @Scheduled(fixedDelay = "45s", initialDelay = "5s")
    void executeEveryFourtyFive() {
        LOG.info("Simple Job every 45 seconds");
    }
}
