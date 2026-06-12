package org.example.calculator;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import static org.mockito.Mockito.mock;

/**
 * Test configuration for integration tests.
 * Provides mock beans for components that require external dependencies.
 */
@TestConfiguration
public class TestConfig {
    
    /**
     * Provides a mock CalculatorService for testing.
     * @return a mock CalculatorService bean
     */
    @Bean
    @Primary
    public CalculatorService calculatorService() {
        return mock(CalculatorService.class);
    }
}
