import kz.aitu.MyHashTable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyHashTableTest {
    private MyHashTable<String, Integer> table;

    @BeforeEach
    public void setUp() {
        table = new MyHashTable<>();
    }

    @Test
    public void testPutAndGet() {
        table.put("key1", 1);
        table.put("key2", 2);

        assertEquals(Integer.valueOf(1), table.get("key1"));
        assertEquals(Integer.valueOf(2), table.get("key2"));
    }

    @Test
    public void testRemove() {
        table.put("key1", 1);
        table.put("key2", 2);

        Integer removedValue = table.remove("key1");
        assertEquals(Integer.valueOf(1), removedValue);
        assertNull(table.get("key1"));
    }

    @Test
    public void testContainsValue() {
        table.put("key1", 1);
        table.put("key2", 2);

        assertTrue(table.containsValue(1));
        assertFalse(table.containsValue(3));
    }

    @Test
    public void testGetKey() {
        table.put("key1", 1);
        table.put("key2", 2);

        assertEquals("key1", table.getKey(1));
        assertNull(table.getKey(3));
    }
}