package pl.ki.az.color.performance;

import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("server_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class PublishEventPerformanceTest {


    @Test
    @Scenario("publish/event/post_new_color_events.json")
    @LoadWith("publish/event/publish_100per10sec.properties")
    public void testPublishMultipleEvents100per1sec() throws Exception {

    }

}
