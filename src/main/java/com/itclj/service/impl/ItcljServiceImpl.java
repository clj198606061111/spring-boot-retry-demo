package com.itclj.service.impl;

import com.itclj.service.ItcljService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class ItcljServiceImpl implements ItcljService {

    private Logger logger = LoggerFactory.getLogger(ItcljServiceImpl.class);

    @Retryable(value = Exception.class, maxAttempts = 3, backoff = @Backoff(delay = 2000, multiplier = 1.5))
    public int add(int a) {
        logger.info("retry add a={}", a);
        if (a < 0) {
            throw new RuntimeException("数量不对，" + a);
        }
        return a + 1;
    }
}
