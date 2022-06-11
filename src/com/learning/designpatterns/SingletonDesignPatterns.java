package com.learning.designpatterns;


import java.io.*;
import java.lang.reflect.Constructor;
import java.util.Objects;

class Resource implements Serializable {
    private int value;
    private static volatile Resource instance = null;

    private Resource() {

    }

    public static Resource getReourseInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Resource.class) {
                instance = new Resource();
            }
        }

        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class SingletonDesignPatterns {

    public static void main(String[] args) throws Exception {

        /*Constructor<?>[] constructors = Resource.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(Boolean.TRUE);

        Resource resource1 = (Resource) constructor.newInstance();
        Resource resource2 = (Resource) constructor.newInstance();

        System.out.println(resource1);
        System.out.println(resource2);

        System.out.println(resource1 == resource2);*/


        Resource resource = Resource.getReourseInstance();
        resource.setValue(1);

        // Serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("out.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(resource);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        resource.setValue(2);

        // Deserialize
        Resource resource2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("out.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            resource2 = (Resource) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Resources.ResourceEnum class not found");
            c.printStackTrace();
        }

        if (resource == resource2) {
            System.out.println("Two objects are same");
        } else {
            System.out.println("Two objects are not same");
        }

        System.out.println(resource.getValue());
        System.out.println(resource2.getValue());


    }
}
