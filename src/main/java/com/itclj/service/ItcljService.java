package com.itclj.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;

public interface ItcljService {

    @Retryable(value = Exception.class, maxAttempts = 3, backoff = @Backoff(delay = 2000, multiplier = 1.5))
    int add(int a);
}
