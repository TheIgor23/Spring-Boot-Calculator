package ru.neoflex.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class PracticeApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnNumberPlus() throws Exception {
		this.mockMvc
				.perform(get("/plus/8/10"))
				.andDo(print())
				.andExpect(content().string(containsString("18")));
	}
	@Test
	public void shouldReturnNumberMinus() throws Exception {
		this.mockMvc
				.perform(get("/minus/43/6"))
				.andDo(print())
				.andExpect(content().string(containsString("37")));
	}
	@Test
	public void shouldReturnNumberDivide() throws Exception {
		this.mockMvc
				.perform(get("/div/200/5"))
				.andDo(print())
				.andExpect(content().string(containsString("40")));
	}
	@Test
	public void shouldReturnNumberMultiple() throws Exception {
		this.mockMvc
				.perform(get("/mult/36/4"))
				.andDo(print())
				.andExpect(content().string(containsString("144")));
	}
}