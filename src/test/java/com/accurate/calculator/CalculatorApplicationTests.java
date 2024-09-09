package com.accurate.calculator;

import com.accurate.calculator.repositories.ResultRepository;
import com.accurate.calculator.services.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorApplicationTests {

	@InjectMocks
	private CalculatorServiceImpl calculatorServiceImpl;

	@Mock
	private ResultRepository resultRepository;

	@Test
	void testSum() {
		var result = calculatorServiceImpl.sum(1, 3);
		assertEquals(4, result);
	}

	@Test
	void testSubstract() {
		var result = calculatorServiceImpl.substract(4, 3);
		assertEquals(1, result);
	}

	@Test
	void testMultiply() {
		var result = calculatorServiceImpl.multiply(4, 3);
		assertEquals(12, result);
	}

	@Test
	void testDivide() {
		var result = calculatorServiceImpl.divide(3, 3);
		assertEquals(1, result);
	}

	@Test
	void testDivideByZero() {

		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			calculatorServiceImpl.divide(1, 0);
		});

		assertEquals("Divisão por zero não é permitida.", exception.getMessage());
	}


}
