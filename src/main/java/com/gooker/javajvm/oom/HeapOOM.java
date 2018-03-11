package com.gooker.javajvm.oom;

import java.util.List;
import java.util.ArrayList;


/**
 * pwd :/JavaJvm/src/main/java
 * javac javac com/gooker/javajvm/oom/HeapOOM.java
 * java com.gooker.javajvm.oom.HeapOOM
 * javac HeapOOM.java
 * java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError HeapOOM
 */
public class HeapOOM {
    static class OOMObject {

    }


    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList();
        while (true) {
            list.add(new OOMObject());
        }
        // System.out.println("hello");
    }
}