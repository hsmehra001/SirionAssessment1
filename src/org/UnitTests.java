package org;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.GameService;

class UnitTests {

	@Test
	void test1() {
		GameService gameTest= new GameService();
		assertNotNull(gameTest.viewAll());
	}
	
	@ParameterizedTest
	@MethodSource("data")
	void test2(String result,String input) {
		GameService gameTest= new GameService();
		assertEquals(result, gameTest.authorSearch(input));
	}
	public static Collection data() {
		return Arrays.asList(new Object[][] {{"SnowBird","Danny"},{"FreshFood","Ram"},{"Pokiman","Steeve"}});
	}
}
