package testscript;

import java.io.File;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import extendedReport.ExtentListeners;
import io.restassured.response.Response;
import utilities.HelperClass;
import utilities.JsonPostRequest;

public class PostRequestUsingFile extends ExtentListeners{
	
	@Test
	public void postRequestUsingFile() throws Exception{
		
		String file= "C:\\Users\\blaxm\\workspace\\StripeRestAssuredAPI\\resource\\json.txt";
		
		Response response=payloadFiles.PayloadToCreatePostRequestWithFile.payloadToCreatePostRequestWithFile(HelperClass.readDataFromPropertyFile().getKey(),
				HelperClass.readDataFromPropertyFile().getContentType(), file, HelperClass.readDataFromPropertyFile().getBaseURL(), 
				HelperClass.readDataFromPropertyFile().getBasePathForPost());
		
		System.out.println(response.jsonPath().get("place_id"));
		
		testReport.get().log(Status.PASS, "place is is generated");
	}
	
	
}
