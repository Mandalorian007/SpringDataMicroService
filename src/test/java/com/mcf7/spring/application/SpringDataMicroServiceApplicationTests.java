package com.mcf7.spring.application;

import com.mcf7.spring.SpringDataMicroServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringDataMicroServiceApplication.class)
@WebAppConfiguration
public class SpringDataMicroServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
