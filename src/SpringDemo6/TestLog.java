package SpringDemo6;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class TestLog {

    private static final Logger log = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        log.info("hell log4j2");
        log.warn("hello log4j2");
    }
}
