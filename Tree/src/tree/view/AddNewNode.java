package tree.view;

import tree.view.draw.GraphicsConstants;
import tree.controller.ControlsNode;
import javax.swing.JOptionPane;
import tree.view.draw.Drawing;

public class AddNewNode extends javax.swing.JFrame {

    private TreeMainFrame mainFrame;

    public AddNewNode() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valLabel = new javax.swing.JLabel();
        left = new javax.swing.JButton();
        right = new javax.swing.JButton();
        value = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        addLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        setPreferredSize(new java.awt.Dimension(250, 160));
        setResizable(false);

        valLabel.setText(" Вес:");

        left.setText("Левый");
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });

        right.setText("Правый");
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });

        cancel.setText("Отмена");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        addLabel.setText("Какой узел создать?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(left))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(right, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(value, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right)
                    .addComponent(left))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel)
                .addContainerGap())
        );

        valLabel.getAccessibleContext().setAccessibleName("Выберите узел \nи определите вес ");

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
        try {
            ControlsNode.add(TreeMainFrame.selectedNode, Integer.parseInt(value.getText()), true);
            after();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода данных.Попробуйте снова");
        }
    }//GEN-LAST:event_leftActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        setVisible(false);
        getMainFrame();
    }//GEN-LAST:event_cancelActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        try {
            ControlsNode.add(TreeMainFrame.selectedNode, Integer.parseInt(value.getText()),false);
            after();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода данных.Попробуйте снова");
        }
    }//GEN-LAST:event_rightActionPerformed

    private TreeMainFrame getMainFrame() {
        mainFrame.setEnabled(true);
        return mainFrame;
    }

    public void setMainFrame(TreeMainFrame MainFrame) {
        this.mainFrame = MainFrame;
        this.setVisible(true);
    }
    
    private void after(){
        setVisible(false);
            Drawing.gr2d.clearRect(0, 0, GraphicsConstants.wight, GraphicsConstants.height);
            Drawing.drawNode(Math.abs(GraphicsConstants.wight/2 - 10), 10, TreeMainFrame.root, 110);
            getMainFrame();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton cancel;
    private javax.swing.JButton left;
    private javax.swing.JButton right;
    private javax.swing.JLabel valLabel;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
