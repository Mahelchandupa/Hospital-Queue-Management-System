
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mahel
 * 
 */


public class Home extends javax.swing.JFrame {

    int c =0;
    public MainList PatientList = new MainList();
    public PatientMedicinesList PMedicines = new PatientMedicinesList();
    
    
    public Home() {
        initComponents();
        jPanelDashboard.setVisible(true);
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);

        TablePatients.getTableHeader().setOpaque(false);
        TablePatients.getTableHeader().setForeground(Color.BLUE);
        TablePatients.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN,13));
 
        TablePharmacy.getTableHeader().setOpaque(false);
        TablePharmacy.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN,13));
        
        TableDelete.getTableHeader().setOpaque(false);
        TableDelete.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN,13));
                
        generateId();
      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableDelete = new javax.swing.JTable();
        btnBack1 = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        btnFillmedicines = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePatients = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ItemNumberLabel1 = new javax.swing.JLabel();
        txtMname = new javax.swing.JTextField();
        txtMid = new javax.swing.JTextField();
        ItemNumberLabel2 = new javax.swing.JLabel();
        txtMhealthCondition = new javax.swing.JTextField();
        txtMmedicine = new javax.swing.JTextField();
        ItemNumberLabel4 = new javax.swing.JLabel();
        ItemNumberLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAddPharmacy = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanelDashboard = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnRiseption = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnPharmacy1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePharmacy = new javax.swing.JTable();
        btnBackTo = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanelPrintPatData = new javax.swing.JPanel();
        PatientRecipt = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PatientPosition = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PatientCondition = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PatientName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PatientId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PrintBtnPatient = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        ReseptionDash = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnDirectPatientRegForm = new javax.swing.JButton();
        btnDirectPatientDelForm = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        AgeField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        ItemNumberLabel = new javax.swing.JLabel();
        IdField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        MedicalField = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(560, 430));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableDelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        TableDelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Patient Id", "Condition", "Index"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableDelete.setRowHeight(25);
        TableDelete.setSelectionBackground(new java.awt.Color(153, 0, 153));
        TableDelete.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TableDelete.getTableHeader().setReorderingAllowed(false);
        TableDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDeleteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableDelete);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 22, -1, 354));

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 388, 93, 30));

        btnDeletePatient.setText("Delete");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });
        jPanel4.add(btnDeletePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 388, 90, 30));

        btnFillmedicines.setText("Select");
        btnFillmedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillmedicinesActionPerformed(evt);
            }
        });
        jPanel4.add(btnFillmedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 388, 90, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/wallpaperflare.com_wallpaper (50).jpg"))); // NOI18N
        jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablePatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Patient Id", "Condition", "Index"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePatients.setRowHeight(25);
        TablePatients.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TablePatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePatients);
        if (TablePatients.getColumnModel().getColumnCount() > 0) {
            TablePatients.getColumnModel().getColumn(1).setResizable(false);
            TablePatients.getColumnModel().getColumn(3).setHeaderValue("Index");
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 20, -1, 354));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back_25px.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 386, 91, 33));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/wallpaperflare.com_wallpaper (42).jpg"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 430));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("      Patient  Medicines Form");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 290, 40));

        ItemNumberLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ItemNumberLabel1.setText("Id :");
        jPanel5.add(ItemNumberLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 34));

        txtMname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMnameFocusLost(evt);
            }
        });
        txtMname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMnameActionPerformed(evt);
            }
        });
        txtMname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMnameKeyTyped(evt);
            }
        });
        jPanel5.add(txtMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 170, 270, 34));

        txtMid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMidFocusLost(evt);
            }
        });
        txtMid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMidActionPerformed(evt);
            }
        });
        txtMid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMidKeyTyped(evt);
            }
        });
        jPanel5.add(txtMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 110, 270, 34));

        ItemNumberLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ItemNumberLabel2.setText("Name :");
        jPanel5.add(ItemNumberLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 34));

        txtMhealthCondition.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMhealthConditionFocusLost(evt);
            }
        });
        txtMhealthCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMhealthConditionActionPerformed(evt);
            }
        });
        txtMhealthCondition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMhealthConditionKeyTyped(evt);
            }
        });
        jPanel5.add(txtMhealthCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 200, 34));

        txtMmedicine.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMmedicineFocusLost(evt);
            }
        });
        txtMmedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMmedicineActionPerformed(evt);
            }
        });
        txtMmedicine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMmedicineKeyTyped(evt);
            }
        });
        jPanel5.add(txtMmedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 200, 34));

        ItemNumberLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ItemNumberLabel4.setText("Health Condition :");
        jPanel5.add(ItemNumberLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 34));

        ItemNumberLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ItemNumberLabel5.setText("Medicines :");
        jPanel5.add(ItemNumberLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 34));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back_25px.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 381, 85, 33));

        btnAddPharmacy.setText("Send to Pharmacy");
        btnAddPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPharmacyActionPerformed(evt);
            }
        });
        jPanel5.add(btnAddPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 167, 33));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/wallpaperflare.com_wallpaper (50).jpg"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));

        jPanelDashboard.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/close_window_20px.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanelDashboard.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 20, 20));

        btnRiseption.setBackground(new java.awt.Color(0, 121, 137));
        btnRiseption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRiseption.setForeground(new java.awt.Color(255, 255, 255));
        btnRiseption.setText("Reception");
        btnRiseption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiseptionActionPerformed(evt);
            }
        });
        jPanelDashboard.add(btnRiseption, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 154, 161, 43));

        btnDoctor.setBackground(new java.awt.Color(0, 121, 137));
        btnDoctor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctor.setText("Doctor's Panel");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });
        jPanelDashboard.add(btnDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 215, 161, 44));

        btnPatient.setBackground(new java.awt.Color(0, 121, 137));
        btnPatient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnPatient.setText("Patient Details");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        jPanelDashboard.add(btnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 277, 161, 46));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("HOSPITAL MANAGMENT SYSTEM");
        jPanelDashboard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 320, 40));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setOpaque(true);
        jPanelDashboard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 340, 40));

        btnPharmacy1.setBackground(new java.awt.Color(0, 121, 137));
        btnPharmacy1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPharmacy1.setForeground(new java.awt.Color(255, 255, 255));
        btnPharmacy1.setText("Pharmacy");
        btnPharmacy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPharmacy1ActionPerformed(evt);
            }
        });
        jPanelDashboard.add(btnPharmacy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 341, 161, 39));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/wallpaperflare.com_wallpaper (49).jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanelDashboard.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setFocusable(false);
        jPanel6.setMinimumSize(new java.awt.Dimension(560, 430));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("      Patient  Medicines");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 6, 232, 37));

        TablePharmacy.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        TablePharmacy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Id", "Name", "Health Condition", "Medicines"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePharmacy.setRowHeight(25);
        TablePharmacy.setSelectionBackground(new java.awt.Color(255, 153, 102));
        TablePharmacy.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablePharmacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePharmacyMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablePharmacy);
        if (TablePharmacy.getColumnModel().getColumnCount() > 0) {
            TablePharmacy.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, 470, 321));

        btnBackTo.setText("Back");
        btnBackTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToActionPerformed(evt);
            }
        });
        jPanel6.add(btnBackTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 382, 98, 36));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/wallpaperflare.com_wallpaper (50).jpg"))); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        jPanelPrintPatData.setBackground(new java.awt.Color(204, 255, 255));
        jPanelPrintPatData.setMinimumSize(new java.awt.Dimension(560, 430));
        jPanelPrintPatData.setPreferredSize(new java.awt.Dimension(560, 430));
        jPanelPrintPatData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientRecipt.setBackground(new java.awt.Color(255, 255, 255));
        PatientRecipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Patient Position :");

        PatientPosition.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PatientPosition.setText("Patient Id :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Patient Condition :");

        PatientCondition.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PatientCondition.setText("Patient Id :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Patient Name :");

        PatientName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PatientName.setText("Patient Id :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Patient Id :");

        PatientId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PatientId.setText("Patient Id :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Patient Recipt");

        javax.swing.GroupLayout PatientReciptLayout = new javax.swing.GroupLayout(PatientRecipt);
        PatientRecipt.setLayout(PatientReciptLayout);
        PatientReciptLayout.setHorizontalGroup(
            PatientReciptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientReciptLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PatientReciptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientReciptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PatientReciptLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PatientReciptLayout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PatientCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PatientReciptLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(PatientPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PatientReciptLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(PatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientReciptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        PatientReciptLayout.setVerticalGroup(
            PatientReciptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientReciptLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(PatientReciptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientReciptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientReciptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PatientReciptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanelPrintPatData.add(PatientRecipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 430, 320));

        PrintBtnPatient.setBackground(new java.awt.Color(153, 102, 255));
        PrintBtnPatient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PrintBtnPatient.setForeground(new java.awt.Color(255, 255, 255));
        PrintBtnPatient.setText("Print");
        PrintBtnPatient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PrintBtnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnPatientActionPerformed(evt);
            }
        });
        jPanelPrintPatData.add(PrintBtnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 95, 30));

        jButton2.setBackground(new java.awt.Color(153, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelPrintPatData.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 97, 30));

        jButton7.setBackground(new java.awt.Color(153, 102, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/emergency_exit_25px.png"))); // NOI18N
        jButton7.setText("Exit ");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelPrintPatData.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 90, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/service004.jpg"))); // NOI18N
        jPanelPrintPatData.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        ReseptionDash.setBackground(new java.awt.Color(255, 255, 255));
        ReseptionDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("RECEPTION");
        ReseptionDash.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 40, 208, 30));

        btnDirectPatientRegForm.setBackground(new java.awt.Color(0, 153, 255));
        btnDirectPatientRegForm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDirectPatientRegForm.setForeground(new java.awt.Color(255, 255, 255));
        btnDirectPatientRegForm.setText("Register Patients");
        btnDirectPatientRegForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectPatientRegFormActionPerformed(evt);
            }
        });
        ReseptionDash.add(btnDirectPatientRegForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 160, 40));

        btnDirectPatientDelForm.setBackground(new java.awt.Color(0, 153, 255));
        btnDirectPatientDelForm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDirectPatientDelForm.setForeground(new java.awt.Color(255, 255, 255));
        btnDirectPatientDelForm.setText("Delete Patients");
        btnDirectPatientDelForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectPatientDelFormActionPerformed(evt);
            }
        });
        ReseptionDash.add(btnDirectPatientDelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 160, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/emergency_exit_25px.png"))); // NOI18N
        jButton3.setText("Exit ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ReseptionDash.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 90, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back_25px.png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ReseptionDash.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 100, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/6.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jLabel11.setPreferredSize(new java.awt.Dimension(560, 430));
        ReseptionDash.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 433));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.setMinimumSize(new java.awt.Dimension(560, 430));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(0, 153, 255));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Register Patient");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 150, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/emergency_exit_25px.png"))); // NOI18N
        jButton6.setText("Exit");
        jButton6.setMaximumSize(new java.awt.Dimension(72, 23));
        jButton6.setMinimumSize(new java.awt.Dimension(72, 23));
        jButton6.setPreferredSize(new java.awt.Dimension(72, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 90, 40));

        AgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeFieldActionPerformed(evt);
            }
        });
        AgeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AgeFieldKeyTyped(evt);
            }
        });
        jPanel3.add(AgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 197, 310, 30));

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });
        jPanel3.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 137, 310, 30));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setText("Name:");
        jPanel3.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 46, 25));

        AgeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AgeLabel.setText("Age :");
        jPanel3.add(AgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 46, 25));

        ItemNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ItemNumberLabel.setText("Id :");
        jPanel3.add(ItemNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 20, 25));

        IdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdFieldFocusLost(evt);
            }
        });
        IdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdFieldActionPerformed(evt);
            }
        });
        IdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdFieldKeyTyped(evt);
            }
        });
        jPanel3.add(IdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 77, 310, 30));

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceLabel.setText("Health Condition :");
        jPanel3.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 31));

        MedicalField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Condition ", "Critical", "Serious", "Stable" }));
        jPanel3.add(MedicalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 220, 34));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("      Patient Details _");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back_25px.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 420, 380));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/wallpaperflare.com_wallpaper (42).jpg"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPrintPatData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ReseptionDash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPrintPatData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ReseptionDash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_nameFieldKeyTyped

    private void IdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_IdFieldFocusLost

    private void IdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdFieldActionPerformed

    }//GEN-LAST:event_IdFieldActionPerformed

    private void IdFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdFieldKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_IdFieldKeyTyped

    public void reset() {
        nameField.setText("");
        AgeField.setText("");
        IdField.setText("");
        MedicalField.setSelectedIndex(0);
        nameField.requestFocus();
    }
    
    private void AgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeFieldActionPerformed

    private void AgeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeFieldKeyTyped

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
       
        
        if(nameField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Your Name");
        }
        else if(AgeField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Your Age");
        }
        else if(IdField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Patient Id");
        }
        else if(MedicalField.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(this, "Select Health Condition");
        }       
        else{
        String name;
        int age;
        int patientid;
        String position;
        name = nameField.getText();
        age = Integer.parseInt(AgeField.getText());
        patientid = Integer.parseInt(IdField.getText());
        position = MedicalField.getSelectedItem().toString();
        
        PatientList.InsertPos(name, age, patientid, position);
        JOptionPane.showMessageDialog(null, "Registration Sucessfull");
       }
        
       reset();
       generateId();
       
    }//GEN-LAST:event_btnAddActionPerformed

    public int generateId(){
    int randomId = 0;  
    Random rand = new Random();   
    for (int j=0;j < 5;j++)  
   {     
       randomId = rand.nextInt();  
       IdField.setText(String.valueOf(randomId));
       IdField.setEditable(false);
   }   
      return randomId;   
} 
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    int value1;
    String value2;
    String value4;
    int value3;
    
    private void TablePatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePatientsMouseClicked
        int index = TablePatients.getSelectedRow();
        TableModel model = TablePatients.getModel();
        value1 = Integer.parseInt(model.getValueAt(index, 1).toString());
        value2 = model.getValueAt(index, 0).toString();
                value4 = model.getValueAt(index, 2).toString();
        value3 = Integer.parseInt(model.getValueAt(index, 3).toString());
        
       
       int a= JOptionPane.showConfirmDialog(null, "Patient Id : "+value1+"\n\nPatient Name : "+value2+"\n\nYour Position : "+ value3+"\n\n\n\nDo you want to print this ?");
         if (a == JOptionPane.YES_OPTION) {
                jPanel4.setVisible(false);
                jPanel2.setVisible(false);
                jPanel5.setVisible(false);
                jPanel6.setVisible(false);
                jPanel1.setVisible(false);
                jPanelDashboard.setVisible(false);
                jPanelPrintPatData.setVisible(false);
                jPanelPrintPatData.setVisible(true);
                
        PatientId.setText(String.valueOf(value1));
        PatientName.setText(String.valueOf(value2));
        PatientPosition.setText(String.valueOf(value3));
        PatientCondition.setText(String.valueOf(value4));


        } else if (a == JOptionPane.CANCEL_OPTION) {
                return;
        }
       
       
    }//GEN-LAST:event_TablePatientsMouseClicked

    int pId;
    String pName,pHealth;
    
    private void TableDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDeleteMouseClicked
        int index = TableDelete.getSelectedRow();
        TableModel model1 = TableDelete.getModel();
       
        pId= Integer.parseInt(model1.getValueAt(index, 1).toString());
        pName = model1.getValueAt(index, 0).toString();
        pHealth  = model1.getValueAt(index, 2).toString();
        
            
    }//GEN-LAST:event_TableDeleteMouseClicked

    public void DeletePatientTable(){
         if(PatientList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "List is empty.!");
        }
         else{
        MainList.Node current = PatientList.head;  
            DefaultTableModel model = (DefaultTableModel) TableDelete.getModel();
            model.setRowCount(0);
            while (current != null) {
                model.addRow(new Object[]{current.name, current.patientid, current.position,PatientList.GetNth(current.name)});
                current = current.next;
            } 
         }
    }
    
    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        ReseptionDash.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);

    }//GEN-LAST:event_btnBack1ActionPerformed

    private void txtMnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnameFocusLost

    private void txtMnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnameActionPerformed

    private void txtMnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnameKeyTyped

    private void txtMidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMidFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMidFocusLost

    private void txtMidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMidActionPerformed

    private void txtMidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMidKeyTyped

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        int a= JOptionPane.showConfirmDialog(null, "Are Sure You Want to Delete?");
        if (a == JOptionPane.YES_OPTION) {
                PatientList.deleteBeg(); 
                DeletePatientTable();
        } else if (a == JOptionPane.CANCEL_OPTION) {
                return;
        }
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    private void btnFillmedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillmedicinesActionPerformed
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
         jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        jPanel5.setVisible(true);
        
        txtMid.setText(String.valueOf(pId));
        txtMid.setEditable(false);

       txtMname.setText(String.valueOf(pName));
       txtMname.setEditable(false);
       
       txtMhealthCondition.setText(String.valueOf(pHealth));
       txtMhealthCondition.setEditable(false);

    }//GEN-LAST:event_btnFillmedicinesActionPerformed

    private void txtMhealthConditionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMhealthConditionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMhealthConditionFocusLost

    private void txtMhealthConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMhealthConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMhealthConditionActionPerformed

    private void txtMhealthConditionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMhealthConditionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMhealthConditionKeyTyped

    private void txtMmedicineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMmedicineFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMmedicineFocusLost

    private void txtMmedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMmedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMmedicineActionPerformed

    private void txtMmedicineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMmedicineKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMmedicineKeyTyped

    private void TablePharmacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePharmacyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablePharmacyMouseClicked

    private void btnAddPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPharmacyActionPerformed
        String name;
        int pid;
        String healthPos;
        String medicines;
        name = txtMname.getText();
        pid = Integer.parseInt(txtMid.getText());
        healthPos= txtMhealthCondition.getText();
        medicines= txtMmedicine.getText();

        PMedicines.InsertPos(pid, name, healthPos, medicines);
        JOptionPane.showMessageDialog(null, "Sucessfull");
        
        txtMid.setText("");
        txtMname.setText("");
        txtMhealthCondition.setText("");
        txtMmedicine.setText("");
    }//GEN-LAST:event_btnAddPharmacyActionPerformed

    private void btnBackToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToActionPerformed
            jPanel4.setVisible(false);
                        jPanel5.setVisible(false);
            jPanel6.setVisible(false);
        jPanel2.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);
                jPanel1.setVisible(false);

    }//GEN-LAST:event_btnBackToActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        ReseptionDash.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PrintBtnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnPatientActionPerformed
    Toolkit tkp = jPanel1.getToolkit();
    PrintJob pjp = tkp.getPrintJob(this, null, null);
    Graphics g = pjp.getGraphics();
    PatientRecipt.print(g);
    g.dispose();
    pjp.end();
    }//GEN-LAST:event_PrintBtnPatientActionPerformed

    private void btnRiseptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiseptionActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(true);
    }//GEN-LAST:event_btnRiseptionActionPerformed

    private void btnDirectPatientRegFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectPatientRegFormActionPerformed
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);
    }//GEN-LAST:event_btnDirectPatientRegFormActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    boolean res = false;
    
    private void btnDirectPatientDelFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectPatientDelFormActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        
        res = true;
        
        btnFillmedicines.setEnabled(false);
                btnDeletePatient.setEnabled(true);

        
        jPanel4.setVisible(true);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);

            DeletePatientTable();
    }//GEN-LAST:event_btnDirectPatientDelFormActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);

        if(PatientList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "List is empty.!");
        }
        else
        {
            MainList.Node current = PatientList.head;  
            DefaultTableModel model = (DefaultTableModel) TablePatients.getModel();
            model.setRowCount(0);
            while (current != null) {
                model.addRow(new Object[]{current.name, current.patientid, current.position,PatientList.GetNth(current.name)});
                current = current.next;
            }
        }
    }//GEN-LAST:event_btnPatientActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
           jPanel1.setVisible(false);
        jPanel2.setVisible(false);
                
        btnFillmedicines.setEnabled(true);
        btnDeletePatient.setEnabled(false);
        
        jPanel4.setVisible(true);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);

            DeletePatientTable();
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnPharmacy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPharmacy1ActionPerformed
      jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);
        jPanel6.setVisible(true);

        if(PMedicines.isEmpty()) {
            JOptionPane.showMessageDialog(this, "List is empty.!");
        }
        else{        
            PatientMedicinesList.Node current = PMedicines.head;  
            DefaultTableModel model = (DefaultTableModel) TablePharmacy.getModel();
            model.setRowCount(0);
            while (current != null) {
                model.addRow(new Object[]{current.patientid ,current.name, current.health, current.medicines});
                current = current.next;
            }
         }

    
         
    }//GEN-LAST:event_btnPharmacy1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(true);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(false);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
      System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanelDashboard.setVisible(true);
        jPanelPrintPatData.setVisible(false);
        ReseptionDash.setVisible(false);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField AgeField;
    private javax.swing.JLabel AgeLabel;
    public javax.swing.JTextField IdField;
    private javax.swing.JLabel ItemNumberLabel;
    private javax.swing.JLabel ItemNumberLabel1;
    private javax.swing.JLabel ItemNumberLabel2;
    private javax.swing.JLabel ItemNumberLabel4;
    private javax.swing.JLabel ItemNumberLabel5;
    private javax.swing.JComboBox<String> MedicalField;
    private javax.swing.JLabel PatientCondition;
    private javax.swing.JLabel PatientId;
    private javax.swing.JLabel PatientName;
    private javax.swing.JLabel PatientPosition;
    private javax.swing.JPanel PatientRecipt;
    private javax.swing.JButton PrintBtnPatient;
    private javax.swing.JPanel ReseptionDash;
    private javax.swing.JTable TableDelete;
    private javax.swing.JTable TablePatients;
    private javax.swing.JTable TablePharmacy;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddPharmacy;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBackTo;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnDirectPatientDelForm;
    private javax.swing.JButton btnDirectPatientRegForm;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnFillmedicines;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPharmacy1;
    private javax.swing.JButton btnRiseption;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelPrintPatData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    public javax.swing.JTextField txtMhealthCondition;
    public javax.swing.JTextField txtMid;
    public javax.swing.JTextField txtMmedicine;
    public javax.swing.JTextField txtMname;
    // End of variables declaration//GEN-END:variables
}
