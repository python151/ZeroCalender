import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Year {
    public Year() {}

    public Day[] year = new Day[365];

    public void setDay(Date date, Day day) {
        this.year[date.dayOfYear()] = day;
    }

    public void showYear() {
        JFrame frame = new JFrame("Your year at a glance");
        frame.setSize(800, 500);
        frame.setLayout(null);
        
        // making the main panel
        JPanel mainPanel = new JPanel();

        JButton btn = new JButton("Day");
        mainPanel.add(btn);
        
        frame.add(mainPanel);

        frame.add(new JButton("Tst"));

        frame.setVisible(true);
    }
}