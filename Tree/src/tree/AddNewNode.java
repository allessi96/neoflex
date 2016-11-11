package tree;

import javax.swing.JOptionPane;

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

        value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valueMouseClicked(evt);
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
    }// </editor-fold>//GEN-END:initComponents

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed

        try {
            if (mainFrame.root!=null) {
                mainFrame.selectedNode.setLeft(new Node(mainFrame.selectedNode.getName() + "0", Integer.parseInt(value.getText()), mainFrame.selectedNode));
                mainFrame.selectedNode = mainFrame.selectedNode.getLeft();
            } else {
                mainFrame.root = new Node("Start", Integer.parseInt(value.getText()), null);
                mainFrame.selectedNode = mainFrame.root;
            }

            setVisible(false);

            mainFrame.gr2d.clearRect(0, 0, 440, 450);
            mainFrame.drawNode(Math.abs(mainFrame.DrawPanel.getWidth() / 2 - 10), 10, mainFrame.root);
            
            getMainFrame();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода данных.Попробуйте снова");
        }
    }//GEN-LAST:event_leftActionPerformed

    private void valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valueMouseClicked
        // TODO add your handling code here:
        value.setText("");
    }//GEN-LAST:event_valueMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

        setVisible(false);
        getMainFrame();
    }//GEN-LAST:event_cancelActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed

        try {
            if (TreeMainFrame.root!=null) {
                mainFrame.selectedNode.setRight(new Node(mainFrame.selectedNode.getName() + "1", Integer.parseInt(value.getText()), mainFrame.selectedNode));
                mainFrame.selectedNode = mainFrame.selectedNode.getRight();
            } else {
                TreeMainFrame.root=new Node("Start", Integer.parseInt(value.getText()), null);
                mainFrame.selectedNode = TreeMainFrame.root;
            }

            setVisible(false);

            mainFrame.gr2d.clearRect(0, 0, 440, 450);
            mainFrame.drawNode(Math.abs(mainFrame.DrawPanel.getWidth() / 2 - 10), 10, TreeMainFrame.root);

            getMainFrame();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода данных.Попробуйте снова");
        }
    }//GEN-LAST:event_rightActionPerformed

    public TreeMainFrame getMainFrame() {
        mainFrame.setEnabled(true);
        return mainFrame;
    }

    public void setMainFrame(TreeMainFrame MainFrame) {
        this.mainFrame = MainFrame;
        this.setVisible(true);
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
