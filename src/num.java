import java.util.*;

public class num {
    public static void main(String[] args) {
        Random generate = new Random();
        String[] name = {"Anushka Rawat",
                "Arya Sharma", "Fajr Eutsey", "Jada Bozeman", "Janae Motley",
                "Kayla Hartland", "Maya Pandurangan", "Mehak Juneja", "Mona Cobb",
                "Pallavi Kanoor", "Pratiti Manojkumar", "Saga Elsekhely",
                "Sanniyah Knight", "Segiade Olajuwon", "Shivani Chandrasekaran",
                "Simone Pipkin", "Wendy Yupa"};
        System.out.println(name[generate.nextInt(17)]);
    }
}