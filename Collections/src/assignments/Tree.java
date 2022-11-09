package assignments;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree {
    public static void main(String args[]) {
        PhoneNumbers n1 = new PhoneNumbers(8939681133L);
        PhoneNumbers n2 = new PhoneNumbers(7358750576L);
        PhoneNumbers n3 = new PhoneNumbers(7812883396L);
        PhoneNumbers n4 = new PhoneNumbers(9629274369L);
        Contact c1 = new Contact("Anusha", "anusha@gmail.com", "female");
        Contact c2 = new Contact("Haritha", "haritha@gmail.com", "female");
        Contact c3 = new Contact("Vasavi", "vasavi@gmail.com", "female");
        Contact c4 = new Contact("Sathish", "sathish@gmail.com", "male");
        TreeMap<PhoneNumbers, Contact> phnContact = new TreeMap<>(new SortByPhoneNumber());
        phnContact.put(n1, c1);
        phnContact.put(n2, c2);
        phnContact.put(n3, c3);
        phnContact.put(n4, c4);
        System.out.println(phnContact);
        Set<Map.Entry<PhoneNumbers, Contact>>

                entrySet = phnContact.entrySet();
        System.out.println("Keys.......................");
        for (Map.Entry<PhoneNumbers, Contact> entry : entrySet) {
            System.out.println(entry.getKey());
        }
        System.out.println("Values..................");
        for (Map.Entry<PhoneNumbers, Contact> entry : entrySet) {
            System.out.println(entry.getValue());
        }

        System.out.println("KeyValuePairs..................");
        for (Map.Entry<PhoneNumbers, Contact> entry : entrySet) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
