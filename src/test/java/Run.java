import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".",dryRun = false,tags = {"@validSearch"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/rep.html"})

public class Run {

  public static String extendDrive = new File("src/main/resources/extent-path.xml").getAbsolutePath();
  @AfterClass
  public static void generateReport()
   {
      Reporter.loadXMLConfig(extendDrive);
   }

}
