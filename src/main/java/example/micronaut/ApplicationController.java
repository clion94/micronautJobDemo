package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Controller("/hello")
public class ApplicationController {

    private static final Logger log = LoggerFactory.getLogger(ApplicationController.class);

    @Inject
    MicronautJobDemo micronautJobDemo = new MicronautJobDemo();

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        log.info("Job Started will run every 10 seconds..");
        micronautJobDemo.executeEveryTen();
        return "Job Started will run every 10 seconds..";
    }
}
