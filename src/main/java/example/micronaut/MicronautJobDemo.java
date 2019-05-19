package example.micronaut;

import io.micronaut.scheduling.annotation.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Singleton
public class MicronautJobDemo {

    private static final Logger log = LoggerFactory.getLogger(MicronautJobDemo.class);

    @Scheduled(fixedDelay = "10s")
    void executeEveryTen() {
        log.info("Simple Job every 10 seconds");
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        log.info("Job execution time: {} ", sdf.format(cal.getTime()));
    }
}
