import org.junit.Test;

import com.interfacepractice.javaPractice.CarService;

public class CarServiceTest {

	@Test
	public void shouldDemonstrateInterfaces() {
		CarService carService = new CarService(); 
		carService.drive();
		carService.message();
		
	}
	
	
}
