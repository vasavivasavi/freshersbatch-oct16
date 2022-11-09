package assignments;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/**
 * Find Out:
 *
 * 1. What are all the unique cities where the traders work?
 *
 *
 * 2. Find all traders from Pune and sort them by name.
 *
 * 3. Return a string of all traders’ names sorted alphabetically.
 *
 *
 * 4. Are any traders based in Indore?
 */
class Trader {
    private String name;
    private String city;
    public Trader(String name, String city) {this.name = name;this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {this.city = city;
    }
    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

