import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;


//The main GUI frame
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Content Alayzer and Locker Inventory System");
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        LockerManagerButton = new javax.swing.JButton();
        SpaceCheckerButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        ManualButton = new javax.swing.JButton();
        AboutButton = new javax.swing.JButton();
        ContentPanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        LockerManagerPanel = new javax.swing.JPanel();
        SpaceCheckerPanel = new javax.swing.JPanel();
        HistoryPanel = new javax.swing.JPanel();
        ManualPanel = new javax.swing.JPanel();
        AboutPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 21, 38));
        setFont(new java.awt.Font("JetBrainsMono NF Medium", 0, 24)); // NOI18N

        Sidebar.setBackground(new java.awt.Color(42, 51, 53));

        jLabel1.setFont(new java.awt.Font("JetBrainsMono NFP Medium", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("C.A.L.I.S.");

        HomeButton.setBackground(new java.awt.Color(10, 94, 176));
        HomeButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("HOME");
        HomeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 94, 176), 1, true));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        LockerManagerButton.setBackground(new java.awt.Color(10, 94, 176));
        LockerManagerButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        LockerManagerButton.setForeground(new java.awt.Color(255, 255, 255));
        LockerManagerButton.setText("Locker Manager");
        LockerManagerButton.setDoubleBuffered(true);
        LockerManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockerManagerButtonActionPerformed(evt);
            }
        });

        SpaceCheckerButton.setBackground(new java.awt.Color(10, 94, 176));
        SpaceCheckerButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        SpaceCheckerButton.setForeground(new java.awt.Color(255, 255, 255));
        SpaceCheckerButton.setText("Space Checker");
        SpaceCheckerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceCheckerButtonActionPerformed(evt);
            }
        });

        HistoryButton.setBackground(new java.awt.Color(10, 94, 176));
        HistoryButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        HistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        HistoryButton.setText("History");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        ManualButton.setBackground(new java.awt.Color(10, 94, 176));
        ManualButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        ManualButton.setForeground(new java.awt.Color(255, 255, 255));
        ManualButton.setText("Manual");
        ManualButton.setActionCommand("");
        ManualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualButtonActionPerformed(evt);
            }
        });

        AboutButton.setBackground(new java.awt.Color(10, 94, 176));
        AboutButton.setFont(new java.awt.Font("JetBrainsMono NFM Medium", 0, 24)); // NOI18N
        AboutButton.setForeground(new java.awt.Color(255, 255, 255));
        AboutButton.setText("About");
        AboutButton.setActionCommand("");
        AboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LockerManagerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SpaceCheckerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManualButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidebarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LockerManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SpaceCheckerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HomeButton.getAccessibleContext().setAccessibleDescription("");

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(HomePanel, "card2");

        LockerManagerPanel.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout LockerManagerPanelLayout = new javax.swing.GroupLayout(LockerManagerPanel);
        LockerManagerPanel.setLayout(LockerManagerPanelLayout);
        LockerManagerPanelLayout.setHorizontalGroup(
            LockerManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        LockerManagerPanelLayout.setVerticalGroup(
            LockerManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(LockerManagerPanel, "card3");

        SpaceCheckerPanel.setBackground(new java.awt.Color(255, 0, 255));

        javax.swing.GroupLayout SpaceCheckerPanelLayout = new javax.swing.GroupLayout(SpaceCheckerPanel);
        SpaceCheckerPanel.setLayout(SpaceCheckerPanelLayout);
        SpaceCheckerPanelLayout.setHorizontalGroup(
            SpaceCheckerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        SpaceCheckerPanelLayout.setVerticalGroup(
            SpaceCheckerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(SpaceCheckerPanel, "card4");

        HistoryPanel.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout HistoryPanelLayout = new javax.swing.GroupLayout(HistoryPanel);
        HistoryPanel.setLayout(HistoryPanelLayout);
        HistoryPanelLayout.setHorizontalGroup(
            HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        HistoryPanelLayout.setVerticalGroup(
            HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(HistoryPanel, "card5");

        ManualPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ManualPanelLayout = new javax.swing.GroupLayout(ManualPanel);
        ManualPanel.setLayout(ManualPanelLayout);
        ManualPanelLayout.setHorizontalGroup(
            ManualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        ManualPanelLayout.setVerticalGroup(
            ManualPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(ManualPanel, "card6");

        AboutPanel.setBackground(new java.awt.Color(0, 255, 102));

        javax.swing.GroupLayout AboutPanelLayout = new javax.swing.GroupLayout(AboutPanel);
        AboutPanel.setLayout(AboutPanelLayout);
        AboutPanelLayout.setHorizontalGroup(
            AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        AboutPanelLayout.setVerticalGroup(
            AboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        ContentPanel.add(AboutPanel, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
          
       ContentPanel.removeAll();
       ContentPanel.add(HomePanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();
  
    }                                          
    
    private void LockerManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
       ContentPanel.removeAll();
       ContentPanel.add(LockerManagerPanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();

    }                                  
    
 

    private void SpaceCheckerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    // Create a panel for space visualization
    JPanel spaceCheckerPanel = new JPanel(new BorderLayout());
    
    // Title label for the space checker
    JLabel titleLabel = new JLabel("Locker Availability ", SwingConstants.CENTER);
    titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
    spaceCheckerPanel.add(titleLabel, BorderLayout.NORTH);

    // Panel to hold grids for each floor
    JPanel floorsPanel = new JPanel();
    floorsPanel.setLayout(new BoxLayout(floorsPanel, BoxLayout.Y_AXIS));
    
    for (int i = 0; i < SIZE; i++) {
        // Create a panel for each floor
        JPanel floorPanel = new JPanel(new GridLayout(5, 5, 5, 5)); // 5x5 grid with gaps
        floorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("LOCKER " + (char) ('A' + i)));
        
        for (int j = 0; j < SIZE; j++) {
            for (int k = 0; k < SIZE; k++) {
                // Check if locker is available or occupied
                String lockerContent = (lockers[i][j][k] == null) 
                    ? (j * SIZE + k + 1) + "" 
                    : "X";
                
                // Create a label for the locker
                JLabel lockerLabel = new JLabel(lockerContent, SwingConstants.CENTER);
                lockerLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
                lockerLabel.setOpaque(true);
                lockerLabel.setBackground(lockers[i][j][k] == null ? new Color(34, 139, 34) : Color.RED);
                lockerLabel.setForeground(Color.WHITE);
                lockerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
                
                // Add label to the floor panel
                floorPanel.add(lockerLabel);
            }
        }
        // Add floor panel to floors panel
        floorsPanel.add(floorPanel);
    }

    // Add floors panel to a scrollable pane
    JScrollPane scrollPane = new JScrollPane(floorsPanel);
    spaceCheckerPanel.add(scrollPane, BorderLayout.CENTER);

    // Display the panel
    ContentPanel.removeAll();
    ContentPanel.add(spaceCheckerPanel);
    ContentPanel.repaint();
    ContentPanel.revalidate();
    }                                                  

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        ContentPanel.removeAll();
       ContentPanel.add(HistoryPanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();
    }     
    
    
    private void ManualButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
      ContentPanel.removeAll();

    // Create a new panel to display the manual
    JPanel manualPanel = new JPanel(new BorderLayout());

    // Title label for the manual
    JLabel titleLabel = new JLabel("C.A.L.I.S. User Manual", SwingConstants.CENTER);
    titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
    manualPanel.add(titleLabel, BorderLayout.NORTH);

    // Text area for the manual content
    JTextArea manualText = new JTextArea();
    manualText.setEditable(false);
    manualText.setLineWrap(true);
    manualText.setWrapStyleWord(true);
    manualText.setFont(new Font("SansSerif", Font.PLAIN, 14));

    // Add the manual content
    manualText.setText("""
        # CALIS (Content Analyzer and Locker Inventory System) User Manual

        ## Table of Contents
        1. Introduction
        2. System Requirements
        3. Installation and Setup
        4. Getting Started
        5. Features and Usage Instructions
           - Home
           - Locker Manager
           - Space Checker
           - History
           - Manual
           - About
        6. Troubleshooting
        7. Contact and Support

        ---

        ## 1. Introduction
        Welcome to CALIS, the Content Analyzer and Locker Inventory System. This application is designed to help administrators of facilities with lockers to efficiently store, organize, and manage items. Whether you manage lockers in schools, businesses, or other establishments, CALIS simplifies the process of tracking contents and optimizing locker usage.

        ---

        ## 2. System Requirements
        - **Operating System**: Compatible with Windows, macOS, and Linux
        - **Java Version**: Ensure Java Runtime Environment (JRE) is installed (version 8 or above recommended)
        - **Storage**: Minimum of 50MB free space
        - **RAM**: 2GB or more recommended

        ---

        ## 3. Installation and Setup
        1. Download the standalone JAR file from the provided link or source.
        2. Ensure that Java is installed on your system.
        3. Double-click the JAR file to launch the application.
        4. If the JAR file doesn’t open, use the terminal or command prompt to run the command:
           ```
           java -jar calis.jar
           ```

        ---

        ## 4. Getting Started
        Upon launching CALIS, you will be greeted with the main window, which consists of:
        - **Left Sidebar**: Contains navigation buttons for various features (Home, Locker Manager, etc.)
        - **Main Panel**: Displays the corresponding content for the selected feature.

        ### Navigation Tips
        - Click on the buttons in the left sidebar to access specific functionalities.
        - Use the "Manual" button for quick help within the app.

        ---

        ## 5. Features and Usage Instructions
        ### 5.1 Home
        The Home screen provides an overview and access to all primary features. Use this screen as the starting point for navigation.

        ### 5.2 Locker Manager
        Manage the lockers effectively:
        - **View Locker Contents**: Select a locker to see its stored items.
        - **Add Item**: Choose a locker and input the item details to store it.
        - **Remove Item**: Select an item from the locker to remove it.
        - **Move Item Between Lockers**: Relocate items by specifying source and destination lockers.

        ### 5.3 Space Checker
        Check the availability of space in each locker:
        - Displays the total and used capacity.
        - Helps optimize storage.

        ### 5.4 History
        View a log of all actions performed, such as items added, removed, or moved.
        - Useful for tracking activity.

        ### 5.5 Manual
        Access the in-app help documentation, which provides a summary of features and tips.

        ### 5.6 About
        Learn more about CALIS, including version information and credits.

        ---

        ## 6. Troubleshooting
        ### Common Issues
        - **App doesn't start**: Ensure Java is installed and properly configured.
        - **Errors while managing lockers**: Verify the input values and try again.
        - **Locker data not updating**: Restart the application.

        If issues persist, refer to the Contact and Support section.

        ---

        ## 7. Contact and Support
        For assistance or inquiries, reach out to the project team:
        - **Email**: support@calisapp.com
        - **Phone**: +1-800-CALIS-HELP

        Thank you for using CALIS! We hope it makes managing lockers easier and more efficient.
        """);

    // Add the text area to a scroll pane
    JScrollPane scrollPane = new JScrollPane(manualText);
    manualPanel.add(scrollPane, BorderLayout.CENTER);

    // Add the manual panel to the ContentPanel
    ContentPanel.add(manualPanel);

    // Refresh the ContentPanel
    ContentPanel.repaint();
    ContentPanel.revalidate();

    }                                            

    
    
    private void AboutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
       ContentPanel.removeAll();
       ContentPanel.add(AboutPanel);
       ContentPanel.repaint();
       ContentPanel.revalidate();
    }                                           

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    
    private final int SIZE = 5;
    private final Items[][][] lockers = new Items[SIZE][SIZE][SIZE];

    
    // Variables declaration - do not modify                     
    private javax.swing.JButton AboutButton;
    private javax.swing.JPanel AboutPanel;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JPanel HistoryPanel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JButton LockerManagerButton;
    private javax.swing.JPanel LockerManagerPanel;
    private javax.swing.JButton ManualButton;
    private javax.swing.JPanel ManualPanel;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JButton SpaceCheckerButton;
    private javax.swing.JPanel SpaceCheckerPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
