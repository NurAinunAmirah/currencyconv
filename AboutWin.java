import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.util.ResourceBundle;

public class AboutWin extends JFrame {
    private static final ResourceBundle BUNDLE= ResourceBundle.getBundle("localization.translation");
    private JPanel contentPane;
    private static AboutWin windowInstance = null;

    private AboutWin(){
        setTitle(BUNDLE.getString("AboutWin.this.title"));
        setBounds(100,100,347,260);
        setLocationRelativeTo(null);
        setResizable(false);

        //window components
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);

        //label "author"
        JLabel lblAuthor= new JLabel(BUNDLE.getString("AboutWin.lblAuthor.text"));
        lblAuthor.setHorizontalAlignment(SwingConstants.CENTER);
        lblAuthor.setBounds(65,122,219,33);

        //label with a clickable linl
        JLabel lblLink=  new JLabel("http://jvinceno.fr");
        lblLink.setBounds(65,159,219,33);
        lblLink.setHorizontalAlignment(SwingConstants.CENTER);
        lblLink.setForeground(Color.BLUE);
        lblLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try{
                    Desktop.getDesktop().browse(new URI("http://jvinceno.fr"));
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        contentPane.setLayout(null);

        JLabel lblTitle= new JLabel("Currency Converter");
        lblTitle.setBounds(65,12,219,33);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Noto Sans", Font.BOLD,15));
        contentPane.add(lblTitle);

        JLabel lblLicenseMit= new JLabel("License GNU GPL v3.0");
        lblLicenseMit.setBounds(65,77,219,33);
        lblLicenseMit.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblLicenseMit);

        JLabel lblVersion= new JLabel("Version 1.0");
        lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
        lblVersion.setBounds(65,45,219,33);
        contentPane.add(lblVersion);
        contentPane.add(lblAuthor);
        contentPane.add(lblLink);
    }

    public static AboutWin getInstance(){
        if(windowInstance== null){
            windowInstance= new AboutWin();
        }
        return  windowInstance;
    }
}
