import org.example.inject.ApiService;
import org.example.inject.EmailService;
import org.example.inject.SMSService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class APiServiceTest {
    @Mock
    EmailService emailService;

    @Mock
    SMSService smsService;

    @InjectMocks
    ApiService apiService;

    @Test
    public void testApi(){
        when(apiService.sendEmail("Email")).thenReturn(true);
        when(apiService.sendSMS(anyString())).thenReturn(false);

        assertTrue(apiService.sendEmail("Email"));
        assertFalse(apiService.sendSMS("Welcome"));
    }
}


