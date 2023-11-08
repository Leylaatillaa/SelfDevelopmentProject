/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayarlar;

import javax.swing.JTextField;

public class textayar {
        
    private static String originalText;
    
    public static void checkTheTextFocusGained(JTextField textField, String org) {
        originalText= org;
        
        if(textField.getText().trim().equals(org)) {
            textField.setText(" ");
        }
    }
    
    public static void checkTheTextFocusLost(JTextField textField) {
        if(textField.getText().trim().equals(" ")) {
            textField.setText(originalText);
        } 
    }

    public static void checkTheTextFocusGained(JTextField kimliktext) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void setOnlyNumber(JTextField kimliktext) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    public static void setOnlyNumber(JTextField textField) {
        textField.addKeyListener(newKeyAdapter(){
         
            @Override
            public void keyTyped (KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isDigit(c))
                    e.consume();
            }
        });
   }
 public static void setOnlyAlphabetic(JTextField textField) {
        textField.addKeyListener(newKeyAdapter(){
         
            @Override
            public void keyTyped (KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isAlphabetic(c))
                    e.consume();
            }
        });
    }
/*
limit ayarları
*/
    private static int limit;
    public static void setMaxLimit(JTextField textField,int lim) {
       limit=lim;
       textField.setDocument(new PlainDocument(){
         
          @Override
          public void insertstring(int offs,String str AttributeSet a)throws BadLocationException {
             if (str==null) {
                 return;
            }
             if ((getLength()+str.length() <=limit) {
                 super.insertString(offs,str,a);
}



       });
    }
}







