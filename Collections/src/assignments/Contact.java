package assignments;

import java.util.Comparator;

class Contact {
    String name, email;
    String gender;
    Contact(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class SortByPhoneNumber implements Comparator {
    public int compare(Object str1, Object str2) {
        String i1 = str1.toString();
        String i2 = str2.toString();
        return i2.compareTo(i1);
    }
}

