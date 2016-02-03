import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.output.OutputHelperSetter;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setter.xml");

		OutputHelperSetter output = (OutputHelperSetter)context.getBean("OutputHelper");
		
		System.out.println(output.getName());
		
    	output.getOutputGenerator().get();
	}
}