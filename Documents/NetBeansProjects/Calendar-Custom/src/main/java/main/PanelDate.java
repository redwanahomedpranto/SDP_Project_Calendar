/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class PanelDate extends javax.swing.JPanel {

    private int month;
    private int year;
    public PanelDate(int month, int year) {
        initComponents();
        this.year = year;
        this.month = month;
        init();
    }
    private void init(){
        sun.asTitle();
        mon.asTitle();
        tues.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        
        setData();
        
    }
    private void setData(){
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new main.Cell();
        mon = new main.Cell();
        tues = new main.Cell();
        wed = new main.Cell();
        thu = new main.Cell();
        fri = new main.Cell();
        sat = new main.Cell();
        cell8 = new main.Cell();
        cell9 = new main.Cell();
        cell10 = new main.Cell();
        cell11 = new main.Cell();
        cell12 = new main.Cell();
        cell13 = new main.Cell();
        cell14 = new main.Cell();
        cell15 = new main.Cell();
        cell16 = new main.Cell();
        cell17 = new main.Cell();
        cell18 = new main.Cell();
        cell19 = new main.Cell();
        cell20 = new main.Cell();
        cell21 = new main.Cell();
        cell22 = new main.Cell();
        cell23 = new main.Cell();
        cell24 = new main.Cell();
        cell25 = new main.Cell();
        cell26 = new main.Cell();
        cell27 = new main.Cell();
        cell28 = new main.Cell();
        cell29 = new main.Cell();
        cell30 = new main.Cell();
        cell31 = new main.Cell();
        cell32 = new main.Cell();
        cell33 = new main.Cell();
        cell34 = new main.Cell();
        cell35 = new main.Cell();
        cell36 = new main.Cell();
        cell37 = new main.Cell();
        cell38 = new main.Cell();
        cell39 = new main.Cell();
        cell40 = new main.Cell();
        cell41 = new main.Cell();
        cell42 = new main.Cell();
        cell43 = new main.Cell();
        cell44 = new main.Cell();
        cell45 = new main.Cell();
        cell46 = new main.Cell();
        cell47 = new main.Cell();
        cell48 = new main.Cell();
        cell49 = new main.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setForeground(new java.awt.Color(153, 0, 0));
        sun.setText("Sun");
        sun.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunActionPerformed(evt);
            }
        });
        add(sun);

        mon.setForeground(new java.awt.Color(153, 0, 0));
        mon.setText("Mon");
        mon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monActionPerformed(evt);
            }
        });
        add(mon);

        tues.setForeground(new java.awt.Color(153, 0, 0));
        tues.setText("Tues");
        tues.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesActionPerformed(evt);
            }
        });
        add(tues);

        wed.setForeground(new java.awt.Color(153, 0, 0));
        wed.setText("Wed");
        wed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        wed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wedActionPerformed(evt);
            }
        });
        add(wed);

        thu.setForeground(new java.awt.Color(153, 0, 0));
        thu.setText("Thu");
        thu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuActionPerformed(evt);
            }
        });
        add(thu);

        fri.setForeground(new java.awt.Color(0, 204, 204));
        fri.setText("Fri");
        fri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friActionPerformed(evt);
            }
        });
        add(fri);

        sat.setForeground(new java.awt.Color(0, 255, 255));
        sat.setText("Sat");
        sat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satActionPerformed(evt);
            }
        });
        add(sat);

        cell8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell8);

        cell9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell9ActionPerformed(evt);
            }
        });
        add(cell9);

        cell10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell10ActionPerformed(evt);
            }
        });
        add(cell10);

        cell11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell11ActionPerformed(evt);
            }
        });
        add(cell11);

        cell12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell12ActionPerformed(evt);
            }
        });
        add(cell12);

        cell13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell13ActionPerformed(evt);
            }
        });
        add(cell13);

        cell14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell14ActionPerformed(evt);
            }
        });
        add(cell14);

        cell15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell15ActionPerformed(evt);
            }
        });
        add(cell15);

        cell16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell16ActionPerformed(evt);
            }
        });
        add(cell16);

        cell17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell17ActionPerformed(evt);
            }
        });
        add(cell17);

        cell18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell18ActionPerformed(evt);
            }
        });
        add(cell18);

        cell19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell19ActionPerformed(evt);
            }
        });
        add(cell19);

        cell20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell20ActionPerformed(evt);
            }
        });
        add(cell20);

        cell21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell21ActionPerformed(evt);
            }
        });
        add(cell21);

        cell22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell22ActionPerformed(evt);
            }
        });
        add(cell22);

        cell23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell23ActionPerformed(evt);
            }
        });
        add(cell23);

        cell24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell24ActionPerformed(evt);
            }
        });
        add(cell24);

        cell25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell25ActionPerformed(evt);
            }
        });
        add(cell25);

        cell26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell26ActionPerformed(evt);
            }
        });
        add(cell26);

        cell27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell27ActionPerformed(evt);
            }
        });
        add(cell27);

        cell28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell28ActionPerformed(evt);
            }
        });
        add(cell28);

        cell29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell29ActionPerformed(evt);
            }
        });
        add(cell29);

        cell30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell30ActionPerformed(evt);
            }
        });
        add(cell30);

        cell31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell31ActionPerformed(evt);
            }
        });
        add(cell31);

        cell32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell32ActionPerformed(evt);
            }
        });
        add(cell32);

        cell33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell33ActionPerformed(evt);
            }
        });
        add(cell33);

        cell34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell34ActionPerformed(evt);
            }
        });
        add(cell34);

        cell35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell35ActionPerformed(evt);
            }
        });
        add(cell35);

        cell36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell36ActionPerformed(evt);
            }
        });
        add(cell36);

        cell37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell37ActionPerformed(evt);
            }
        });
        add(cell37);

        cell38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell38ActionPerformed(evt);
            }
        });
        add(cell38);

        cell39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell39ActionPerformed(evt);
            }
        });
        add(cell39);

        cell40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell40ActionPerformed(evt);
            }
        });
        add(cell40);

        cell41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell41ActionPerformed(evt);
            }
        });
        add(cell41);

        cell42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell42ActionPerformed(evt);
            }
        });
        add(cell42);

        cell43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell43ActionPerformed(evt);
            }
        });
        add(cell43);

        cell44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell44ActionPerformed(evt);
            }
        });
        add(cell44);

        cell45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell45ActionPerformed(evt);
            }
        });
        add(cell45);

        cell46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell46ActionPerformed(evt);
            }
        });
        add(cell46);

        cell47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell47ActionPerformed(evt);
            }
        });
        add(cell47);

        cell48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell48ActionPerformed(evt);
            }
        });
        add(cell48);

        cell49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell49ActionPerformed(evt);
            }
        });
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    private void sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sunActionPerformed

    private void monActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monActionPerformed

    private void tuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuesActionPerformed

    private void wedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wedActionPerformed

    private void thuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thuActionPerformed

    private void friActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_friActionPerformed

    private void satActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satActionPerformed

    private void cell8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell8ActionPerformed

    private void cell9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell9ActionPerformed

    private void cell10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell10ActionPerformed

    private void cell11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell11ActionPerformed

    private void cell12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell12ActionPerformed

    private void cell13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell13ActionPerformed

    private void cell14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell14ActionPerformed

    private void cell15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell15ActionPerformed

    private void cell16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell16ActionPerformed

    private void cell17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell17ActionPerformed

    private void cell18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell18ActionPerformed

    private void cell19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell19ActionPerformed

    private void cell20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell20ActionPerformed

    private void cell21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell21ActionPerformed

    private void cell22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell22ActionPerformed

    private void cell23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell23ActionPerformed

    private void cell24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell24ActionPerformed

    private void cell25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell25ActionPerformed

    private void cell26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell26ActionPerformed

    private void cell27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell27ActionPerformed

    private void cell28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell28ActionPerformed

    private void cell29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell29ActionPerformed

    private void cell30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell30ActionPerformed

    private void cell31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell31ActionPerformed

    private void cell32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell32ActionPerformed

    private void cell33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell33ActionPerformed

    private void cell34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell34ActionPerformed

    private void cell35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell35ActionPerformed

    private void cell36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell36ActionPerformed

    private void cell37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell37ActionPerformed

    private void cell38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell38ActionPerformed

    private void cell39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell39ActionPerformed

    private void cell40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell40ActionPerformed

    private void cell41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell41ActionPerformed

    private void cell42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell42ActionPerformed

    private void cell43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell43ActionPerformed

    private void cell44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell44ActionPerformed

    private void cell45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell45ActionPerformed

    private void cell46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell46ActionPerformed

    private void cell47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell47ActionPerformed

    private void cell48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell48ActionPerformed

    private void cell49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell49ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.Cell cell10;
    private main.Cell cell11;
    private main.Cell cell12;
    private main.Cell cell13;
    private main.Cell cell14;
    private main.Cell cell15;
    private main.Cell cell16;
    private main.Cell cell17;
    private main.Cell cell18;
    private main.Cell cell19;
    private main.Cell cell20;
    private main.Cell cell21;
    private main.Cell cell22;
    private main.Cell cell23;
    private main.Cell cell24;
    private main.Cell cell25;
    private main.Cell cell26;
    private main.Cell cell27;
    private main.Cell cell28;
    private main.Cell cell29;
    private main.Cell cell30;
    private main.Cell cell31;
    private main.Cell cell32;
    private main.Cell cell33;
    private main.Cell cell34;
    private main.Cell cell35;
    private main.Cell cell36;
    private main.Cell cell37;
    private main.Cell cell38;
    private main.Cell cell39;
    private main.Cell cell40;
    private main.Cell cell41;
    private main.Cell cell42;
    private main.Cell cell43;
    private main.Cell cell44;
    private main.Cell cell45;
    private main.Cell cell46;
    private main.Cell cell47;
    private main.Cell cell48;
    private main.Cell cell49;
    private main.Cell cell8;
    private main.Cell cell9;
    private main.Cell fri;
    private main.Cell mon;
    private main.Cell sat;
    private main.Cell sun;
    private main.Cell thu;
    private main.Cell tues;
    private main.Cell wed;
    // End of variables declaration//GEN-END:variables
}
