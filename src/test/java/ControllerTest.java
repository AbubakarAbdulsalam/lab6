
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class ControllerTest {

    @Autowired
    private Controller controller;

    @org.junit.jupiter.api.Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
