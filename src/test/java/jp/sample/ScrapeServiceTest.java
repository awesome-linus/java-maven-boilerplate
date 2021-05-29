package jp.sample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.IOException;

public class ScrapeServiceTest {
    @Test
    public void getTitle() throws IOException {
        final ScrapeService scrapeService = new ScrapeService();
        assertEquals("Qiita", scrapeService.getTitle());
    }
}