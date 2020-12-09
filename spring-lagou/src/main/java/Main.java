import com.lagou.service.LagouService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring
 * @Package: PACKAGE_NAME
 * @ClassName: Main
 * @Author: nala
 * @Description:
 * @Date: 2020-12-01 17:51
 * @Version: 1.0
 */
public class Main {

	public static void main(String[] args){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		LagouService lagouService = (LagouService) applicationContext.getBean("lagouService");
		System.out.println("lagouService = " + lagouService);

	}

}
