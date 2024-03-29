package com.example.songr;

import com.example.songr.controllers.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SongrApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception {
		HomeController hc = new HomeController();
		assertEquals("World Hello", hc.reverseSentence("Hello World"));
		//this.mockMvc.perform(MockMvcRequestBuilders.get("/").andDo(MockMvcResultHandlers.print()));
	}

}
