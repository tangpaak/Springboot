package com.example.demoresttemplate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//Hamcrest -> Matchers
//JUnit5 -> jupiter -> @Mock, @InjectMock, Mockito (when)
//Spring Test Framework -> @WebMvcTest
//what is @SpringbootTest

//I am going test the Server start Process, with dependency checking

@SpringBootTest //  Withc a complete context
//mvn test -> Simulate App Server Start & Bean Injection on Context
class ApplicationTests {

	

	@Test
	void contextLoads() {
	} //Test server Start

}
