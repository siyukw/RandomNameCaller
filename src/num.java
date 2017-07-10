import java.awt.*;
import java.util.*;

public class num {
    public static void main(String[] args) {
        /* fulllist of names
        String[] name = {"Anushka Rawat",
                "Arya Sharma", "Fajr Eutsey", "Jada Bozeman", "Janae Motley",
                "Amanda Jones", "Maya Pandurangan", "Mehak Juneja", "Mona Cobb",
                "Pallavi Kanoor", "Pratiti Manojkumar", "Saga Elsekhely",
                "Sanniyah Knight", "Segiade Olajuwon", "Shivani Chandrasekaran",
                "Simone Pipkin", "Wendy Yupa", "Sophia Augustine"};*/
        String[] name = {"Anushka Rawat",
                "Arya Sharma", "Fajr Eutsey", "Jada Bozeman", "Janae Motley",
                "Amanda Jones", "Maya Pandurangan", "Mehak Juneja", "Mona Cobb",
                "Pallavi Kanoor", "Pratiti Manojkumar", "Saga Elsekhely",
                "Sanniyah Knight", "Segiade Olajuwon", "Shivani Chandrasekaran",
                "Simone Pipkin", "Wendy Yupa", "Sophia Augustine"};
        String[] absent = {};
        String result = caller(name);
        draw(result);
    }

    public static String caller(String[] names) {
        Random generate = new Random();
        int count = names.length;
        return names[generate.nextInt(count - 1)];
    }

    public static void draw(String name) {
        DrawingPanel p = new DrawingPanel(1000, 600);
        Graphics g = p.getGraphics();
        p.setBackground(new Color(146, 208, 183));
        Font newFont = g.getFont().deriveFont(g.getFont().getSize() * 7F);
        g.setFont(newFont);
        g.drawString(name, 200, 250);
    }

}