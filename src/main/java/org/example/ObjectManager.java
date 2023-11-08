package org.example;

import java.util.ArrayList;

public class ObjectManager<T> {
    protected int idCounter = 0;
    protected ArrayList<T> objects = new ArrayList<>();

    public void addNewObject(T newObject) {
        objects.add(newObject);
    }

    public ArrayList<T> getAllObjects() {
        return objects;
    }
}
