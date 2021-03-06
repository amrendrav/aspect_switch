package com.poc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = AspectSwitchApplication.class)
@AutoConfigureMockMvc
public class AspectSwitchApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

	@Before
	public void setUp() throws Exception {

		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void givenFeaturePropertyFalse_whenIncreaseSalary_thenNoIncrease()
			throws Exception {
		/*Employee emp = new Employee(1, 2000);
		employeeRepository.save(emp);*/

		System.setProperty("a2c.feature", "false");

		 mockMvc.perform(get("/a2c-endpoint"))
				.andExpect(status().is(200));

		/*emp = employeeRepository.findOne(1L);
		assertEquals("salary incorrect", 2000, emp.getSalary(), 0.5);*/
	}

}
