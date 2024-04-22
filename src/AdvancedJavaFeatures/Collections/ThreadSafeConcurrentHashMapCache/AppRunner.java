package AdvancedJavaFeatures.Collections.ThreadSafeConcurrentHashMapCache;

import java.util.concurrent.TimeUnit;

public class AppRunner {

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeCache<String, String> cache = new ThreadSafeCache<>(5, TimeUnit.SECONDS);

        cache.put("key1", "value1");
        System.out.println("Get key1: " + cache.get("key1"));  // Outputs "value1"

        // Wait for more than 5 seconds
        Thread.sleep(6000);

        // Trying to get the expired key
        System.out.println("Get key1 after expiry: " + cache.get("key1"));  // Outputs "null"
    }
}
