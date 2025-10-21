package com.publisher.SamPublisher;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.publisher.SamPublisher.serviceImpl.AddTwoNumbers;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddTwoNumbersTest {

    @InjectMocks
    AddTwoNumbers addTwoNumbers;

    @Test
    public void addTwoNum()
    {
        int a=5,b=5;
        assertEquals(10,addTwoNumbers.addTwoNum(a,b));
    }
}
