
import java.awt.Color;
import javax.swing.JButton;


public class MainClass {
     
    public static void main(String args[]) {
        KullaniciGirisi form = new KullaniciGirisi();
        form.main(args);
    }
    
    private static Color originalBgColor;
    public static void setBg(JButton button,Color bgColor) {
        originalBgColor =button.getBackground();
        button.setBackground(bgColor);
    }
    
    public static void setOriginalBg(JButton button) {
        button.setBackground(originalBgColor);
    }
}    
    


   
    