package CTD.drager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DragerApplication {

	private static final Logger logger = Logger.getLogger(DragerApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(DragerApplication.class, args);
		logger.info("\n >>>> The application started successfuly <<<<");
	}
}
