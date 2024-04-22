package AdvancedJavaFeatures.Collections.ThreadSafeConcurrentHashMapCache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class ThreadSafeCache<K, V> {
    private final ConcurrentHashMap<K, V> map;
    private final long expiryDuration;
    private final ConcurrentHashMap<K, Long> timeMap;

    public ThreadSafeCache(long expiryDuration, TimeUnit timeUnit) {
        this.map = new ConcurrentHashMap<>();
        this.timeMap = new ConcurrentHashMap<>();
        this.expiryDuration = TimeUnit.MILLISECONDS.convert(expiryDuration, timeUnit);
    }

    // Adds or updates an entry in the cache
    public void put(K key, V value) {
        map.put(key, value);
        timeMap.put(key, System.currentTimeMillis() + expiryDuration);
    }

    // Retrieves an entry from the cache
    public V get(K key) {
        Long expiryTime = timeMap.get(key);
        if (expiryTime != null && expiryTime > System.currentTimeMillis()) {
            return map.get(key);
        } else {
            // Entry expired or never set
            map.remove(key);
            timeMap.remove(key);
            return null;
        }
    }

    // Removes an entry from the cache
    public void remove(K key) {
        map.remove(key);
        timeMap.remove(key);
    }

    // Checks whether the cache contains a specific key
    public boolean containsKey(K key) {
        return map.containsKey(key) && timeMap.get(key) > System.currentTimeMillis();
    }

    // Clears the cache
    public void clear() {
        map.clear();
        timeMap.clear();
    }

    // Gets the number of entries in the cache
    public int size() {
        return map.size();
    }
}
