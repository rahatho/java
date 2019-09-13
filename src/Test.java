import java.awt.*;

public class Test {

    public static void main(String[] args){
        EventQueue.invokeLater(()->{

            var ex = new SimpleEx();
            ex.setVisible(true);
        });
    }
}
