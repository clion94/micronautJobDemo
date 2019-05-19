package example.micronaut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class ApplicationControllerTest {

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    public void testHello() throws Exception {
        HttpRequest request = HttpRequest.GET("/hello");
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals(body, "Job Started will run every 10 seconds..");
        }
    }
