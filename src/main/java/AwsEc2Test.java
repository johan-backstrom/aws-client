import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.RunInstancesRequest;

public class AwsEc2Test {

    public void doShit(){

        AmazonEC2ClientBuilder builder = AmazonEC2ClientBuilder
                .standard()
                .withRegion(Regions.EU_WEST_1)
                .withCredentials(new ProfileCredentialsProvider("default"));

        builder.build().runInstances(
                new RunInstancesRequest()
                        .withImageId("ami-785db401")
                        .withInstanceType("t2.micro")
                        .withMinCount(1)
                        .withMaxCount(1)
                        .withKeyName("johan")
                        .withSecurityGroups("default")
        );
    }
}