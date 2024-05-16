package kz.aitu;

import java.util.Random;

public class MyTestingClass {
    private int value;

    public MyTestingClass(int value) {
        this.value = value;
    }

    public int customHashCode() {
        return value % 100;
    }

    public int customImprovedHashCode() {
        int hash = value;
        hash = (hash ^ (hash >>> 16)) * 0x45d9f3b;
        hash = (hash ^ (hash >>> 13)) * 0x45d9f3b;
        hash = hash ^ (hash >>> 16);
        return hash;
    }
}
