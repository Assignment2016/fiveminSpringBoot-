package check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages ="check")
public class SampleController {
	
	@Autowired
	private IDisplayer displayer;
	
	@ResponseBody
	@RequestMapping("/")
	String home(){
		return "<H2>"+displayer.getInfo()+"</H2>";
		
	}
	
	public static void main(String [] args) throws Exception{
		SpringApplication sa=new SpringApplication(SampleController.class);
		sa.run(args);
	}
	

}
