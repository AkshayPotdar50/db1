package com.atos.deproj.sprint2145.design.sprint4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

final class ImmutableKey{

    /*
    *
    * Mark the class as final (Prevents subclassing).
Make fields private and final (Prevents modification after initialization).
Provide a constructor that initializes all fields.
No setters (Prevent modifications after object creation).
Override hashCode() and equals() (Ensures correct behavior in HashMap).
*/

    private final String name;
    private final int id;

    public ImmutableKey(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableKey that = (ImmutableKey) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "ImmutableKey{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}

public class ImmutableClass{
    public static void main(String[] args) {

        Map<ImmutableKey, String> map= new HashMap<>();


        ImmutableKey key1 = new ImmutableKey("alice", 101);
        ImmutableKey key2= new ImmutableKey("bob", 102);

        map.put(key1, "developer");
        map.put(key2, "manager");
        System.out.println("Map"+map);

    }
}



