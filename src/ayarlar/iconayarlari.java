/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayarlar;



public class iconayarlari {
    
    private static void changeIcon(JLabel label,String fileName) {
        originalIcon = label.getIcon();
        labelsetIcon(new ImageIcon(Package.getPackages().getClass().getResoruce("default package/iconlar/"+fileName+".png")));
        
    }
    
    public static void setOrginalIcon(JLabel label) {
        label.setIcon(originalIcon);
    }
}
