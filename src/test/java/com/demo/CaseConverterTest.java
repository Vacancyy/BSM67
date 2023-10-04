package com.demo;
import com.demo.CaseConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CaseConverterTest {
	CaseConverter caseConverter;
	
	@BeforeEach
	void init() {
		caseConverter = new CaseConverter();
	}
	
	@Nested
    class ConvertCaseTests {

        @Test
        public void testConvertCaseWithNullInput() {
            String result = caseConverter.convertCase(null);
            assertEquals("", result);
        }

        @Test
        public void testConvertCaseWithEmptyInput() {
            String result = caseConverter.convertCase("");
            assertEquals("", result);
        }

        @Test
        public void testConvertCaseWithSingleDigitInput() {
            String result = caseConverter.convertCase("5");
            assertEquals("5", result);
        }

        @Test
        public void testConvertCaseWithSingleLetterInput() {
            String result = caseConverter.convertCase("a");
            assertEquals("A", result);
        }

        @Test
        public void testConvertCaseWithLowerCaseInput() {
            String result = caseConverter.convertCase("hello");
            assertEquals("HELLO", result);
        }

        @Test
        public void testConvertCaseWithUpperCaseInput() {
            String result = caseConverter.convertCase("world");
            assertEquals("WORLD", result);
        }

    }

    @Nested
    class IsNumberTests {

        @Test
        public void testIsNumberWithNumberInput() {
            assertTrue(caseConverter.isNumber("5"));
        }

        @Test
        public void testIsNumberWithNonNumberInput() {
            assertFalse(caseConverter.isNumber("a"));
        }
    }
}
