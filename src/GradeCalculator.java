import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GradeCalculator extends Applet implements ActionListener {
    Label sub1, sub2, sub3, sub4, marksObtained, totalMarks, percentage, result;
    TextField t1, t2, t3 ,t4, t5, t6, t7;
    Button button;

    @Override
    public void init() {
        sub1 = new Label("First Subject: ");
        sub2 = new Label("Second Subject: ");
        sub3 = new Label("Third Subject: ");
        sub4 = new Label("Fourth Subject: ");
        marksObtained = new Label("Marks Obtained: ");
        totalMarks = new Label("Total Marks: 400");
        percentage = new Label("Percentage");
        result = new Label("Result");
        t1 = new TextField(15);
        t2 = new TextField(15);
        t3 = new TextField(15);
        t4 = new TextField(15);
        t5 = new TextField(15);
        t6 = new TextField(15);
        t7 = new TextField(15);
        button = new Button("Calculate");
        button.addActionListener(this);
        add(sub1); add(t1);
        add(sub2); add(t2);
        add(sub3); add(t3);
        add(sub4); add(t4);
        add(button);
        add(marksObtained); add(t5); add(totalMarks);
        add(percentage); add(t6); add(result); add(t7);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        float s1 = Float.parseFloat(t1.getText());
        float s2 = Float.parseFloat(t2.getText());
        float s3 = Float.parseFloat(t3.getText());
        float s4 = Float.parseFloat(t4.getText());
        float mo = s1+s2+s3+s4;
        t5.setText(""+mo);
        float pa = (mo/400)*100;
        t6.setText(""+pa);
        if(pa>=80){
            t7.setText("A");
        }else if(pa>=60){
            t7.setText("B");
        }
        else if(pa>=40){
            t7.setText("C");
        }
        else {
            t7.setText("D");
        }
    }
}
/*<applet code="GradeCalculator.java" height=350 width=550></applet>*/
