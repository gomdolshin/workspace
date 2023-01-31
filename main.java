import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleLogTest{

    private static final Logger log = LoggerFactory.getLogger(SampleLogTest.class);
    public static void main(String[] args){
        세면도구세트 세01호 = new 세면도구세트();
        세01호.칫솔 = 2;
        세01호.치약 = 5;

        세면도구세트 세03호 = new 세면도구세트();
        세03호.칫솔 = 8;
        세03호.치약 = 9;

        log.info(세01호.칫솔);
        log.info(세01호.칫솔);
    }
}