package com.taner23.common.util;

public class IdempotencyUtil {

    public static String buildKey(String serviceName, String eventType, String eventId) {
        return String.format("idempotency:%s:%s:%s", serviceName, eventType, eventId);
    }
}