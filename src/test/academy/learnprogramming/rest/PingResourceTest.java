package academy.learnprogramming.rest;

import com.airhacks.JAXRSConfiguration;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.runner.RunWith;



import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class PingResourceTest {

    private final String HELLO_WORLD = "Hello, World!";

    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "wakma-hrms.war")
                .addClass(com.airhacks.ping.boundary.PingResource.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }




    @org.junit.Test
    public void ping() {
        assertEquals("Hello, World!", HELLO_WORLD);
    }
}
